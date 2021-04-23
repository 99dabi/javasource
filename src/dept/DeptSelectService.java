package dept;

import java.sql.Connection;
import java.util.List;
import static emp.jdbcUtil.*;

public class DeptSelectService {
	public List<DeptVo> getList(){
		
		Connection con = getConnection();
		DeptDAO dao = new DeptDAO(con);
		List<DeptVo> list = dao.deptSelect();
		
				
				
		close(con);
		return list;
	}
}
