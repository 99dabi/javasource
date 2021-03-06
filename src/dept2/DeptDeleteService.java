package dept2;

import static emp.jdbcUtil.*;

import java.sql.Connection;

public class DeptDeleteService {
	public boolean deptDelete(int deptno) {
		boolean isDelete = false;
		
		Connection con = getConnection();
		DeptDAO dao = new DeptDAO(con);
		if(dao.delete(deptno)==true) {
			commit(con);
			isDelete=true;
		}else {
			rollback(con);
		}
		
		close(con);
		return isDelete;
	}
}
