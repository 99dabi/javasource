package user2;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import static user2.JdbcUtil.*;

public class UserSelectAllService {
	public List<UserVO> listAll() {
		Connection con=getConnection();
		UserDAO dao = new UserDAO(con);
				
		List<UserVO> list = dao.getList();
		
		close(con);
		close(con);
		return list;
	}
}
