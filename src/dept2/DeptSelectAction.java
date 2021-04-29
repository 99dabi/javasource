package dept2;

import java.util.List;
import java.util.Scanner;

public class DeptSelectAction implements Action {

	@Override
	public void execute(Scanner sc) {
		//서비스에게 요청 : 전체 부서 정보 조회
		DeptSelectService service = new DeptSelectService();
		List<DeptVo> list = service.getList();
		
		
		//요청 결과에 따라 적절하게 출력
		ConsoleUtil util = new ConsoleUtil();
		//vo를 받아서 vo안에 들어있는 deptno,dname,loc을 받아야함
		if(list.isEmpty()) {
			//출력할거 없음
			util.printListFailMessage();
		}else {
			//출력할 거 있음
			util.printListSuccessMessage(list);
		}
	}

}
