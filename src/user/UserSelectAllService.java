package user;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import exshop.User;

import static user.jdbcUtil.*;

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
