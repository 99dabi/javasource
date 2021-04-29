package user2;

import java.util.Scanner;

import user.UserDeleteService;

public class UserDeleteAction implements Action{

	@Override
	public void execute(Scanner sc) {
		//탈퇴할 회원번호 입력
		ConsoleUtil util = new ConsoleUtil();
		int service = util.userDelete(sc);
		//탈퇴 서비스 조회
		UserDeleteService userDelete = new UserDeleteService();
		boolean result = userDelete.delete(service);
		
		//결과 출력
		if(result==true) {
			util.printDeleteSussessMessage();
		}else {
			util.printDeleteFailMessage();
		}
	}
	
}
