package user2;
import static user2.JdbcUtil.*;

import java.sql.Connection;

public class UserUpdateService {
	public boolean updateUser(int no, String addr,String mobile) {
		boolean isUpdate=false;
		Connection  con = getConnection();
		
		UserDAO dao = new UserDAO(con);
		int result = dao.update(addr, mobile, no); 
				
		if(result>0) {
			commit(con);
			isUpdate=true;
		}else {
			rollback(con);
		}
		close(con);
		
				
		return isUpdate;
	}
}
