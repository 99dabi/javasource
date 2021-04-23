package dept;

import java.sql.Connection;
import static emp.jdbcUtil.*;
public class DeptUpdateService {
	public boolean deptUpdate(int loc, String deptno) {
		boolean isUpdate = false;
		
		Connection con = getConnection();
		DeptDAO dao = new DeptDAO(con);
		
		if(dao.update(loc, deptno)) {
			commit(con);
			isUpdate = true;
		}else {
			rollback(con);
		}
		
		close(con);
		return isUpdate;
	}
}
