package user2;

import java.sql.Connection;
import java.util.Scanner;

import user.UserAddService;
import user2.JdbcUtil.*;

public class UserAddAction implements Action {

	@Override
	public void execute(Scanner sc) {
		//새로운 사용자 정보를 입력받기 => ConsoleUtil
		ConsoleUtil util = new ConsoleUtil();
		UserVO vo = util.userAdd(sc);
		// 사용자 정보 추가 서비스 요청 => UserAddService
		UserAddService userAdd = new UserAddService();
		boolean isAdd = userAdd.add(vo.getUsername(), 
				vo.getBirthyear(), vo.getAddr(), vo.getMobile());
		//요청 결과에 따라 메세지 출력 => ConsoleUtil
		if(isAdd) {
			util.printAddSussessMessage();
		}else {
			util.printAddFailMessage();
		}
	}

}
