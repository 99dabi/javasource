package emp;

import java.util.List;
import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.println("-----------");
			System.out.println("메뉴 선택");
			System.out.println("1.특정 사원 조회|2.전체 사원 조회|3.사원입력|4.사원 수정|5.사원 삭제|6.종료");
			System.out.println("-----------");
			
			System.out.println("메뉴 >>");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				System.out.print("사원번호를 입력하세요 : ");
				int empno = Integer.parseInt(sc.nextLine());//7521...
				
				//dao.selectOne(empno);
				//System.out.println(dao.selectOne(empno));
				EmpSelectOneService empOne = new EmpSelectOneService();
				EmpVO vo = empOne.getEmp(empno);
				if(vo!=null) {
				System.out.print("empno :"+vo.getEmpno()+"\t");
				System.out.print("ename :"+vo.getEname()+"\t");
				System.out.print("job :"+vo.getJob()+"\t");
				System.out.print("hiredate :"+vo.getHiredate()+"\t");
				System.out.print("comm :"+vo.getComm()+"\t");
				System.out.print("deptno :"+vo.getDeptno()+"\t");
				
				}else {
					System.out.println(" 사원번호를 확인해 주세요 ");
				}
				
				break;
			case 2:
				EmpSelectService empService = new EmpSelectService();
				List<EmpVO> list = empService.getEmpList();
				
				for (EmpVO vo1:list) {
					System.out.print("empno :"+vo1.getEmpno()+"\t");
					System.out.print("ename :"+vo1.getEname()+"\t");
					System.out.print("job :"+vo1.getJob()+"\t");
					System.out.print("hiredate :"+vo1.getHiredate()+"\t");
					System.out.print("comm :"+vo1.getComm()+"\t");
					System.out.print("deptno :"+vo1.getDeptno()+"\n");
				}
				break;
				case 3:
					System.out.println("부서 정보 입력");
					System.out.print("사원번호 >> ");
					empno = Integer.parseInt(sc.nextLine());
					System.out.print("사원명 >> ");
					String ename = sc.nextLine();
					System.out.print("직무 >> ");
					String job = sc.nextLine();
					System.out.print("매니저 >> ");
					int mgr = Integer.parseInt(sc.nextLine());
					System.out.print("급여 >> ");
					int sal = Integer.parseInt(sc.nextLine());
					System.out.print("추가수당 >> ");
					int comm = Integer.parseInt(sc.nextLine());
					System.out.print("부서번호 >> ");
					int deptno = Integer.parseInt(sc.nextLine());
					EmpVO vo1 = new EmpVO();
					vo1.setEmpno(empno);
					vo1.setEname(ename);
					vo1.setJob(job);
					vo1.setMgr(mgr);
					vo1.setSal(sal);
					vo1.setComm(comm);
					vo1.setDeptno(deptno);
					
					EmpInsertService insertService = new EmpInsertService();
					boolean isInsert = insertService.empInsert(vo1);
					
					
					
					
					System.out.println(isInsert?"입력성공":"입력실패");
					break;
				case 4:///empno, comm(수정)=>
					System.out.println("\n 부서수정");
					System.out.print("수정하고 싶은 empno : ");
					empno = Integer.parseInt(sc.nextLine());
					System.out.print("수정 할 추가수당 값 : ");
					int comm1 = Integer.parseInt(sc.nextLine());
					
					EmpUpdateService updateService = new EmpUpdateService();
					updateService.empUpdate(comm1, empno);
					boolean isUpdate = updateService.empUpdate(comm1, empno);
					System.out.println(isUpdate?"수정 완료":"수정 실패");
					//System.out.println((dao.update(empno, comm1))?"수정 완료":"수정 실패");
					
					break;
				case 5:
					System.out.println("\n 사원 삭제");
					System.out.print("삭제하고 싶은 사원의 번호: ");
					empno = Integer.parseInt(sc.nextLine());
					System.out.print("삭제하고 싶은 사원 이름 : ");
					String ename1=sc.nextLine();
					
					EmpDeleteService deleteService = new EmpDeleteService();
					boolean isDelete = deleteService.empDelete(empno, ename1);
					
							
					System.out.println(isDelete?"삭제 성공":"삭제 실패");
					break;
				case 6:
					run=false;
					break;
				default:
				
				System.out.println("번호를 확인해 주세요 ");
				break;
			}
		}
		
		
	
		
		
		
	}	
}
