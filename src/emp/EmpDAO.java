package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static emp.jdbcUtil.*;
public class EmpDAO {

	private Connection con;
	
	
	
	public EmpDAO(Connection con) {
		this.con = con;
	}
	
	public List<EmpVO> select(){
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql ="select * from emp_temp";
		List<EmpVO> list = new ArrayList<EmpVO>();
		
		try {
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				EmpVO vo =new EmpVO();
				vo.setEmpno(rs.getInt("empno"));
				vo.setEname(rs.getString("ename"));
				vo.setJob(rs.getString("job"));
				vo.setMgr(rs.getInt("mgr"));
				vo.setHiredate(rs.getDate("hiredate"));
				vo.setSal(rs.getInt("sal"));
				vo.setComm(rs.getInt("comm"));
				vo.setDeptno(rs.getInt("deptno"));
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
	}//deptSelect end
	
	
	public EmpVO selectOne(int empno) {
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql ="select * from emp_temp where empno=?";
		EmpVO vo = null;
		try {
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno);//? 에대한 세팅 구문(숫자 : 물음표 순서)
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo = new EmpVO();
				vo.setEmpno(rs.getInt("empno"));
				vo.setEname(rs.getString("ename"));
				vo.setJob(rs.getString("job"));
				vo.setMgr(rs.getInt("mgr"));
				vo.setHiredate(rs.getDate("hiredate"));
				vo.setSal(rs.getInt("sal"));
				vo.setComm(rs.getInt("comm"));
				vo.setDeptno(rs.getInt("deptno"));
			
				System.out.println();
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
		}return vo;
	}
	

	public int insert(EmpVO vo) {
		PreparedStatement pstmt=null;
		int result=0;
		try {
			
			String sql ="insert into emp_temp(empno,ename,job,mgr,hiredate,sal,comm,deptno) ";
			sql+="values (?,?,?,?,sysdate,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, vo.getEmpno());
			pstmt.setString(2, vo.getEname());
			pstmt.setString(3, vo.getJob());
			pstmt.setInt(4, vo.getMgr());
			pstmt.setInt(5, vo.getSal());
			pstmt.setInt(6, vo.getComm());
			pstmt.setInt(7, vo.getDeptno());
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				close(pstmt);
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}			
		}return result;
	}//insert end
	
	public int update(int comm, int empno) {
		PreparedStatement pstmt=null;
		//update emp_temp set comm=? where empno=?
		String sql="update emp_temp set comm=? where empno=?";
		int result=0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, comm);
			pstmt.setInt(2, empno);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				close(pstmt);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}			
		return result;
	}// update end
		
		


	public int delete(int empno, String ename) {
		PreparedStatement pstmt=null;
		//delete from emp+temp where empno=? and ename=?
		boolean deleteFlag=false;
		String sql ="delete from emp_temp where empno=? and ename=?";
		
		int result=0;
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, empno);
			pstmt.setString(2, ename);

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
		}return result;
	
	}//delete end
	
	
	
			
			
			
}
	

