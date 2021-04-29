package user2;

import java.util.List;
import java.util.Scanner;


public class UserSelectAction implements Action{

	@Override
	public void execute(Scanner sc) {
		//호출
		ConsoleUtil util = new ConsoleUtil();
		util.userSelect();
		//사용자 정보 출력 서비스 호출
		UserSelectAllService allService = new UserSelectAllService();
		List<UserVO> list = allService.listAll();
		//출력 여부
		if(list!=null) {
			util.printSelectSussessMessage(list);
		}else {
			util.printSelectFailMessage();
		}
		
	}

}
