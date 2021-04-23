package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static emp.jdbcUtil.*;
public class DeptDAO {
	//Connection/select/insert/update/delete
	
	private Connection con;
	public DeptDAO(Connection con) {
		super();
		this.con = con;
	}

	PreparedStatement pstmt;
	ResultSet rs;
	
	public Connection getConnection() {
		try {
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
		String sql = "select * from dept_temp where deptno=?";
		DeptVo vo = null;
		
		con = getConnection();
		try {
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			rs=pstmt.executeQuery();
		
			if(rs.next()) {
				vo = new DeptVo();
				vo.setDeptno(rs.getInt("deptno"));
				vo.setDname(rs.getString("dname"));
				vo.setLoc(rs.getString("loc"));
				
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}	finally {
			try {
				close(rs);
				close(pstmt);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}return vo;
	}//selectOne end
	
	//INSERT 담당
	public boolean insert(DeptVo vo) {
		String sql ="insert into dept_temp(DEPTNO,DNAME,LOC) values(?,?,?)";
		boolean insertFlag=false;
		
		try {
			PreparedStatement pstmt=null;
			
			
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
		//필드명은 ? 사용이 안된다
		String sql = "update dept_temp set loc=? where deptno=?";
		try {
			PreparedStatement pstmt=null;
			
			
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
		String sql ="delete from dept_temp where deptno=?";
		try {
			PreparedStatement pstmt=null;
			
			
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
