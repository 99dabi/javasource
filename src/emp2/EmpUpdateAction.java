package emp2;

import java.util.Scanner;

public class EmpUpdateAction implements Action{

	@Override
	public void execute(Scanner sc) {
		//update를 위한 정보 받기 => util에 부탁하겠다
		ConsoleUtil util = new ConsoleUtil();
		EmpVO vo = util.printUpdateMessage(sc);
		
		EmpUpdateService updateService = new EmpUpdateService();
		boolean isUpdate = updateService.empUpdate(vo.getComm(), vo.getEmpno());
		if(isUpdate) {
			util.printAddSuccessMessage();
		}else {
			util.printAddFailMessage();
		}
	}
	
}
