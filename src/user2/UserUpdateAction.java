package user2;

import java.util.Scanner;

import user.UserUpdateService;

public class UserUpdateAction implements Action{

	@Override
	public void execute(Scanner sc) {
		//회원 번호, 수정내용 입력 (주소, 핸드폰)
		ConsoleUtil util = new ConsoleUtil();
		UserVO vo = util.userUpdate(sc);
		//사용자 수정 서비스 요청
		UserUpdateService updateService = new UserUpdateService();
		boolean isUpdate = updateService.updateUser
				(vo.getNO(), vo.getAddr(), vo.getMobile());
		
		//요청 결과에 따른 메세지 출력
		if(isUpdate==true) {
			util.printUpdateSussessMessage(vo.getNO());
		}else{
			util.printUpdateFailMessage();
		}
	}
	
}
