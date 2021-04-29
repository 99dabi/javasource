package dept2;

import java.util.Scanner;


public class DeptGetAction implements Action {

	@Override
	public void execute(Scanner sc) {
		//조회할 deptno 입력받기
		ConsoleUtil util = new ConsoleUtil();
		int deptno = util.deptGet(sc);
		//입력받는 deptno를 이용해 서비스 요청하기
		DeptSelectOneService service=new DeptSelectOneService();
		DeptVo vo = service.getRow(deptno);
		//요청후 받은 결과를 통해 적절한 메세지 화면 출력하기
		if(vo!=null) {
			util.printGetMessage(vo);
		}else {
			util.printGetFailMessage(deptno);
		}
	}
}
