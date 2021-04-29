package user2;

import java.sql.Connection;
import static user2.JdbcUtil.*;
public class UserSelectOneService {
	public UserVO getUser(int no) {
		
		Connection con = getConnection();
		UserDAO dao = new UserDAO(con);
		
		UserVO vo = dao.selectOne(no);
		close(con);
		
		return vo;
	}
}
