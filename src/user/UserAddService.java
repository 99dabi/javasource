package user;

import java.sql.Connection;
import static user.jdbcUtil.*;
public class UserAddService {
	//Service : 비즈니스 로직 처리
	//데이터베이스 작업 호출
	public boolean add(String userName,int birthyear,String addr,String mobile) {
		boolean isAdd=false;
		
		Connection con = getConnection();
		UserDAO dao = new UserDAO(con);
		
		int result=dao.insert(userName, birthyear, addr, mobile);
		if(result>0) {
			commit(con);
			isAdd=true;
		}
		close(con);
		return isAdd;
	}
}
