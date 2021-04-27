package emp2;

import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) {
		//emp에서 만든거 찢을꺼다
		//empMain action 
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			Action action = null;
			System.out.println("-----------");
			System.out.println("메뉴 선택");
			System.out.println("1.특정 사원 조회|2.전체 사원 조회|3.사원입력|4.사원 수정|5.사원 삭제|6.종료");
			System.out.println("-----------");
			System.out.println("메뉴 >>");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				action = new EmpSelectAction();
				break;
			case 2:
				action = new EmpListAction();
				break;
			case 3:
				action = new EmpAddAction();
				break;
			case 4:
				action = new EmpUpdateAction();
				break;
			case 5:
				action = new EmpRemoveAction();
				break;
			case 6 :
				run = false;
				break;
			}
			if(action!=null) {
				action.execute(sc);
			}
		}
	}
}
	
