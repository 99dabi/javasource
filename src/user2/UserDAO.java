package user2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import static user2.JdbcUtil.*;

public class UserDAO {
	
	private Connection con;

	public UserDAO(Connection con) {
		super();
		this.con = con;
	}
	

	//1. 쿼리문 결정
		//select => 하나의 레코드를 가져오기 
		//select * from userTBL where no=? => 다음 pk이면 무조건 1개  
		public UserVO selectOne(int no) {
			String sql = "select * from userTBL where no=?"; 
			PreparedStatement pstmt = null;
			ResultSet rs=null;//결과 값 가져오기
			UserVO vo = null;
			try {
			
				pstmt=con.prepareStatement(sql);
				pstmt.setInt(1, no);
				rs=pstmt.executeQuery();
				
				if(rs.next()) {
					vo = new UserVO();
					vo.setNO(rs.getInt("no"));
					vo.setUsername(rs.getString("username"));
					vo.setBirthyear(rs.getInt("birthyear"));
					vo.setAddr(rs.getString("addr"));
					vo.setMobile(rs.getString("mobile"));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					close(rs);
					close(pstmt);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			return vo;
		}//selectOne END;
		//select * from userTBL where username like => 여러개 list<VO>
		
		
		//select => 번체의 레코드 가져오기
		//select * from userTBL;
		public List<UserVO> getList(){
			String sql = "select * from userTBL"; 
			PreparedStatement pstmt = null;
			ResultSet rs=null;
			List<UserVO> list = new ArrayList<UserVO>();
			try {
				UserVO vo = null;
				pstmt=con.prepareStatement(sql);
				rs=pstmt.executeQuery();
				
				while(rs.next()) {
					vo = new UserVO();
					vo.setNO(rs.getInt("no"));
					vo.setUsername(rs.getString("username"));
					vo.setBirthyear(rs.getInt("birthyear"));
					vo.setAddr(rs.getString("addr"));
					vo.setMobile(rs.getString("mobile"));
					list.add(vo);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					close(rs);
					close(pstmt);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			return list;
		}//select end
		
		//update = 전화번호, 주소 변경
		//update userTBL set addr=?,moblie=? where no=? 
		public int update(String addr, String mobile, int no) {
			String sql = "update userTBL set addr=?,mobile=? where no=?";
			PreparedStatement pstmt = null;
			int result=0;
			try {
				pstmt=con.prepareStatement(sql);
				pstmt.setString(1, addr);
				pstmt.setString(2, mobile);
				pstmt.setInt(3, no);
				result=pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					close(pstmt);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			return result;
		}
		
		
		//delete
		public int delete(int no) {
			String sql = "delete from userTBL where no=?";
			PreparedStatement pstmt = null;
			int result=0;
			try {
				pstmt= con.prepareStatement(sql);
				pstmt.setInt(1, no);
				result = pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					close(pstmt);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			return result;
		}
		
		
		//insert
		//insert into userTBL(no,username,birthyear,addr,mobile) values(?,?,?,?,?)
		public int insert(String username, int birthday, String addr, String mobile) {
			//public int insert(UserVO vo)
			String sql = "insert into userTBL(no,username,birthyear,addr,mobile) ";
			sql+="values(user_seq.nextval,?,?,?,?)";
			
			PreparedStatement pstmt = null;
			int result =0;
			try {
				pstmt=con.prepareStatement(sql);
				
				pstmt.setString(1, username);	//(1,vo.getBirthYear())
				pstmt.setInt(2, birthday);		//(2,vo.getBirthYear())
				pstmt.setString(3, addr);		//(3,vo.getAddr())
				pstmt.setString(4, mobile);		//(4,vo.getMobile())
				result =pstmt.executeUpdate();	
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					close(pstmt);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}return result;
		}
		
		
}
