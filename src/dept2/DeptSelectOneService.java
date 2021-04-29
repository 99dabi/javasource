package dept2;
import static emp.jdbcUtil.*;

import java.sql.Connection;

public class DeptSelectOneService {
	public DeptVo getRow(int deptno){
		
		Connection con = getConnection();
		DeptDAO dao = new DeptDAO(con);	
		
		DeptVo vo = dao.selectOne(deptno);
		
		close(con);
		
		return vo;
	}
}