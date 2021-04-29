package user2;

import java.util.Scanner;



public class UserSelectOneAction implements Action{

	
	@Override
	public void execute(Scanner sc) {
		//원하는 사용자 정보 입력
		ConsoleUtil util = new ConsoleUtil();
		int service = util.userNo(sc);
		
		//사용자 정보 서비스 요청
		UserSelectOneService userSelect= new UserSelectOneService();
		UserVO vo = userSelect.getUser(service);
		
		//요청 결과에 따라 메세지 출력
		if(vo!=null) {
			util.printSussessMessage(vo);
		}else {
			util.printFailMessage();
		}
	}

}
