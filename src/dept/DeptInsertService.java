package dept;

import java.sql.Connection;
import static emp.jdbcUtil.*;

public class DeptInsertService {
	public boolean deptInsert(DeptVo vo) {
		boolean isInsert = false;
		
		Connection con = getConnection();
		DeptDAO dao = new DeptDAO(con);
		
		if(dao.insert(vo)) {
			commit(con);
			isInsert=true;
		}else {
			rollback(con);
		}
		
		return isInsert;
	}
}
