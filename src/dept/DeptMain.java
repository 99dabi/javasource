package dept;

import java.util.List;
import java.util.Scanner;

public class DeptMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("메뉴 선택");
			System.out.println("1.특정 부서 조회|2.전체 부서 조회|3.부서 입력|4.부서 정보 수정|5.부서 정보 삭제|6.종료");
			System.out.println("-------------------------------------------------------");
			
			System.out.println("메뉴 >>");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				System.out.println("부서 번호 입력 >> ");
				int deptno = Integer.parseInt(sc.nextLine());
				DeptSelectOneService deptOne=new DeptSelectOneService();
				DeptVo vo = deptOne.getRow(deptno);
				System.out.print("deptno\tdname\tloc");
				System.out.print(vo.getDeptno()+"\t");
				System.out.print(vo.getDname()+"\t");
				System.out.println(vo.getLoc()+"\n");
				break;
			case 2:
				DeptSelectService selectService = new DeptSelectService();
				List<DeptVo> list = selectService.getList();
				for(DeptVo vo1:list) {
					System.out.print(vo1.getDeptno()+"\t");
					System.out.print(vo1.getDname()+"\t");
					System.out.print(vo1.getLoc()+"\n");
				}
				break;
			case 3:
//				System.out.println("\n부서 정보");
//				System.out.print("부서번호 >>");
//				deptno = Integer.parseInt(sc.nextLine());
//				System.out.print("부서명 >> ");
//				String dname = sc.nextLine();
//				System.out.print("부서위치 >> ");
//				String loc = sc.nextLine();
//
//				DeptVo vo1 = new DeptVo();
//				vo1.setDeptno(deptno);
//				vo1.setDname(dname);
//				vo1.setLoc(loc);
//				
//				System.out.println(dao.insert(vo1)?"입력성공":"입력 실패");
//				
				break;
			case 4:
				System.out.println("\n부서 정보 수정");
				System.out.println("수정할 부서 번호 입력 >> ");
				deptno = Integer.parseInt(sc.nextLine());
				System.out.println("수정할 지역명 입력 >> ");
				String loc = sc.nextLine();
				
				DeptUpdateService updateService = new DeptUpdateService();
				
				boolean isUpdate = updateService.deptUpdate(loc,deptno);
				
				System.out.println(isUpdate?"수정 성공":"수정 실패");
				break;
			case 5:
				System.out.println("\n부서 정보 삭제");
				System.out.println("삭제할 부서 번호 입력 >> ");
				deptno = Integer.parseInt(sc.nextLine());
				DeptDeleteService deptDelete = new DeptDeleteService();
				boolean isDelete = deptDelete.deptDelete(deptno);
				System.out.println(isDelete?"삭제 성공":"삭제 실패");
				break;	
			case 6:
				run=false;
				break;	
			}
		}	
	}
}
