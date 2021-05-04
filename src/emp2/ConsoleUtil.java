package emp2;

import java.util.List;
import java.util.Scanner;


public class ConsoleUtil {
	//화면 출력과 화면에서 입력받는 부분에 대한 메소드 
	// = ui구문
//	public int getEmp(Scanner sc) {
//	System.out.print("사원번호를 입력하세요 : ");
//	int empno = Integer.parseInt(sc.nextLine());
//	
//	return empno;
//	}
	public String getEmp(Scanner sc) {
		System.out.print("사원번호를 입력하세요 : ");
		String ename = sc.nextLine();
		
		return ename;
		}
	public void printEmp(EmpVO vo) {

			System.out.print("empno :"+vo.getEmpno()+"\t");
			System.out.print("ename :"+vo.getEname()+"\t");
			System.out.print("job :"+vo.getJob()+"\t");
			System.out.print("hiredate :"+vo.getHiredate()+"\t");
			System.out.print("comm :"+vo.getComm()+"\t");
			System.out.print("deptno :"+vo.getDeptno()+"\n");
	}
//	public void printFailMessage(int empno) {
//		System.out.println(empno+" : 사원번호를 확인해 주세요 ");		
//	}
	public void printFailMessage(String ename) {
		System.out.println(ename+" : 사원번호를 확인해 주세요 ");		
	}
	public void printListEmp(List<EmpVO> list) {
		for (EmpVO vo:list) {
			System.out.print("empno :"+vo.getEmpno()+"\t");
			System.out.print("ename :"+vo.getEname()+"\t");
			System.out.print("job :"+vo.getJob()+"\t");
			System.out.print("hiredate :"+vo.getHiredate()+"\t");
			System.out.print("comm :"+vo.getComm()+"\t");
			System.out.print("deptno :"+vo.getDeptno()+"\n");
		}
	}
	public void printListFailMessage() {
		System.out.println("가져올 EMP목록이 없습니다.");		
	}
	public EmpVO printAddMessage(Scanner sc) {
		System.out.println("부서 정보 입력");
		System.out.print("사원번호 >> ");
		int empno = Integer.parseInt(sc.nextLine());
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
		
		return vo1;
	}
	public void printAddFailMessage() {
		System.out.println("emp 사원 추가 실패");
	}
	public void printAddSuccessMessage() {
		System.out.println("emp 사원 추가 성공");
	}
	public EmpVO printUpdateMessage(Scanner sc) {
		System.out.println("\n 부서수정");
		System.out.print("수정하고 싶은 empno : ");
		int empno = Integer.parseInt(sc.nextLine());
		System.out.print("수정 할 추가수당 값 : ");
		int comm = Integer.parseInt(sc.nextLine());
		
		EmpVO vo = new EmpVO();
		vo.setEmpno(empno);
		vo.setComm(comm);
		
		return vo;
	}
	public void printUpdateFailMessage() {
		System.out.println("emp 사원 수정 실패");
	}
	public void printUpdateSuccessMessage() {
		System.out.println("emp 사원 수정 성공");
	}
	public EmpVO printRemoveMessage(Scanner sc) {
		System.out.println("\n 사원 삭제");
		System.out.print("삭제하고 싶은 사원의 번호: ");
		int empno = Integer.parseInt(sc.nextLine());
		System.out.print("삭제하고 싶은 사원 이름 : ");
		String ename=sc.nextLine();
		
		EmpVO vo = new EmpVO();
		vo.setEmpno(empno);
		vo.setEname(ename);
		
		return vo;
	}public void printRemoveFailMessage() {
		System.out.println("emp 사원 탈퇴 실패");
	}
	public void printRemoveSuccessMessage() {
		System.out.println("emp 사원 탈퇴 성공");
	}
	
	
	
	
	
}
