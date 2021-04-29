package user2;

import static user2.JdbcUtil.*;

import java.sql.Connection;
public class UserDeleteService {
	public boolean delete(int no) {
		
		Connection con = getConnection();
		boolean isDelete=false;
		
		UserDAO dao = new UserDAO(con);
		int result = dao.delete(no);
		if(result>0) {
			commit(con);
			isDelete=true;
		}else {
			rollback(con);
		}
		
		close(con);
		return isDelete;
	}
}
