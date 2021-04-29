package emp2;

import java.util.Scanner;

import emp.EmpDeleteService;

public class EmpRemoveAction implements Action{

	@Override
	public void execute(Scanner sc) {
		
		ConsoleUtil util = new ConsoleUtil();
		EmpVO vo = util.printRemoveMessage(sc);
		
		
		EmpDeleteService deleteService = new EmpDeleteService();
		boolean isDelete = deleteService.empDelete(vo.getEmpno(), vo.getEname());
		
		if(isDelete) {
			util.printRemoveSuccessMessage();
		}else {
			util.printRemoveFailMessage();
		}		
	}
}
