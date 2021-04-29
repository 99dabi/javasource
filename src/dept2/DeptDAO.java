package dept2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static dept2.JdbcUtil.*;
public class DeptDAO {
	//Connection/select/insert/update/delete
	
	private Connection con;
	public DeptDAO(Connection con) {
		super();
		this.con = con;
	}

	
	
	public Connection getConnection() {
		try {
			PreparedStatement pstmt;
			ResultSet rs;
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			con = DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public List<DeptVo> deptSelect() {
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql = "select * from dept_temp";
		List<DeptVo> list = new ArrayList<DeptVo>();
		try {
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				DeptVo vo = new DeptVo();
				vo.setDeptno(rs.getInt("deptno"));
				vo.setDname(rs.getString("dname"));
				vo.setLoc(rs.getString("loc"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				close(rs);
				close(pstmt);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}return list;
	}//deptSelect
	
	public DeptVo selectOne(int deptno) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;	
		String sql = "select * from dept_temp where deptno=?";
		DeptVo vo = null;
		try {			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo = new DeptVo();
				vo.setDeptno(rs.getInt("deptno"));
				vo.setDname(rs.getString("dname"));
				vo.setLoc(rs.getString("loc"));
				System.out.println();
			}			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return vo;
	}//selectOne end
	
	//INSERT 담당
	public boolean insert(DeptVo vo) {
		PreparedStatement pstmt=null;
		String sql ="insert into dept_temp(DEPTNO,DNAME,LOC) values(?,?,?)";
		boolean insertFlag=false;
		
		try {
			pstmt=con.prepareStatement(sql);
			//?세팅
			pstmt.setInt(1, vo.getDeptno());
			pstmt.setString(2, vo.getDname());
			pstmt.setString(3, vo.getLoc());
			
			//insert 성공한 갯수를 리턴
			int result = pstmt.executeUpdate();
			if(result>0) {
				insertFlag=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				close(pstmt);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} return insertFlag;
	}//INSERT END
	
	public boolean update(String loc, int deptno) {
		boolean updateFlag=false;
		PreparedStatement pstmt=null;
		//필드명은 ? 사용이 안된다
		String sql = "update dept_temp set loc=? where deptno=?";
		try {
			pstmt = con.prepareStatement(sql);
			//? 세팅
			pstmt.setString(1,loc);
			pstmt.setInt(2, deptno);
			//실행 
			int result = pstmt.executeUpdate();
			if(result>0) {
				updateFlag=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
			close(pstmt);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}return updateFlag;
	}//update end
	
	public boolean delete(int deptno) {
		boolean deleteFlag=false;
		PreparedStatement pstmt=null;
		String sql ="delete from dept_temp where deptno=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			int result = 0;
			if(result>0) {
				deleteFlag=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				close(pstmt);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}return deleteFlag;
	}//delete end
	
	
	
}
