package dept2;

import java.util.Scanner;

public class DeptUpdateAction implements Action{

	@Override
	public void execute(Scanner sc) {
		// 수정할 정보를 입력받기 => util 시키기
		ConsoleUtil util = new ConsoleUtil();
		DeptVo vo = util.deptUpdate(sc);
	
		//부서정보 수정 서비스 요청
		DeptUpdateService service = new DeptUpdateService();
		boolean result = service.deptUpdate(vo.getLoc(),vo.getDeptno());
		//요청 결과에 따라 적절한 메세지 출력 => util
		if(vo==null) {
			util.printUpdateFailMessage();
		}else {
			util.printUpdateSussessMessage();
		}
	}
}
