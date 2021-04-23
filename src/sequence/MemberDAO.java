package sequence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	//jdbc
	//1. 드라이버 로드
	//2.연결 시도
	//3. sql문 전송
	//4. sql문 실행
	//5. 결과 받기
	//6. 결과 리턴
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs;
	public Connection getcoConnection() {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String user = "shop";
			String password = "12345";
			return DriverManager.getConnection(url,user,password);

		} catch (Exception e) {
			e.printStackTrace();
		}return null;
	}
	
	public boolean insert(String userName) {
		boolean insertFlag = false;

		
		try {
			con=getcoConnection();
			String sql ="insert into member(userNo,userName) values(member_seq.nextval,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userName);
			int result = pstmt.executeUpdate();
			if(result>0) {
				insertFlag = true;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return insertFlag;
	}//insert end
	
	public List<MemberVO> getList(){
		String sql = "select * from member";
		List<MemberVO> list = new ArrayList<MemberVO>();
		con=getcoConnection();
		try {
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();//select 문이라 executeQuery()
			
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setUserNo(rs.getInt("userNo"));
				vo.setUserName(rs.getString("userName"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				pstmt.close();
				rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}return list;
		
	}//getList end
	
	public MemberVO getRow(int userNo) {
		String sql = "select * from member where userNo=?";
		MemberVO vo=null;
		try {
			con=getcoConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userNo);
			rs = pstmt.executeQuery();
			if(rs.next()) {

				vo = new MemberVO();
				vo.setUserNo(rs.getInt("userNo"));
				vo.setUserName(rs.getString("userName"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}return vo;
	}
	
}
