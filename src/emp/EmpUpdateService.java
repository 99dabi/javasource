package emp;

import static emp.jdbcUtil.*;

import java.sql.Connection;

public class EmpUpdateService {
	public boolean empUpdate(int comm, int empno) {
		boolean isUpdate = false;
		Connection con = getConnection();
		EmpDAO dao = new EmpDAO(con);
		
		int result = dao.update(comm, empno);
		
		if(result>0) {
			commit(con);
			isUpdate = true;
		}else {
			rollback(con);
		}
		close(con);
		return isUpdate;
	}
}
