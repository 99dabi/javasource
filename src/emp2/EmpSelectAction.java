package emp2;

import java.util.Scanner;


public class EmpSelectAction implements Action {
//서비스 부름
	@Override
	public void execute(Scanner sc) {
		//여기에 console 작업이 다른곳에서 필요한 경우에 재 사용성을 높이기 위해 
		//사용자에게 조회할 empno를 입력 받기
		ConsoleUtil util = new ConsoleUtil();
		int empno = util.getEmp(sc);
		
		
		//empno를 넘겨서 서비스에게 요청하기 
		EmpSelectOneService empOne = new EmpSelectOneService();
		EmpVO vo = empOne.getEmp(empno);

		//서비스 요청 결과로 받은 vo를 화면 출력해주기
		if(vo != null) {
			util.printEmp(vo);
		}else {
			util.printFailMessage(empno);
		}
	}

}
