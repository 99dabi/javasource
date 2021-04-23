package dept;
import static emp.jdbcUtil.*;

import java.sql.Connection;

public class DeptSelectOneService {
	public DeptVo getRow(int empno) {
		
		Connection con = getConnection();
		DeptDAO dao = new DeptDAO(con);
		
		
		DeptVo vo = dao.selectOne(empno);
		return vo;
	}
}
