package dept2;

import java.util.List;
import java.util.Scanner;


public class ConsoleUtil {
	public int deptGet(Scanner sc) {
		System.out.println("부서 번호 입력 >> ");
		return Integer.parseInt(sc.nextLine());	
	}
	public void printGetMessage(DeptVo vo) {//vo 내용을 출력하는 메소드
		System.out.println("deptno\tdname\tloc");
		System.out.print(vo.getDeptno()+"\t");
		System.out.print(vo.getDname()+"\t");
		System.out.println(vo.getLoc()+"\n");
	}
	public void printGetFailMessage(int deptno) {//vo가 널일 때 출력하는 메소드
		System.out.println(deptno+" 부서번호를 확인해 주세요.");
	}
	
	//list가 비어있을 때 출력
	public void printListFailMessage() {
		System.out.println("조회할 내용이 없음");
	}
	//list내용이 있을 때 출력
	public void printListSuccessMessage(List<DeptVo> list) {
		for(DeptVo vo1:list) {
			System.out.print(vo1.getDeptno()+"\t");
			System.out.print(vo1.getDname()+"\t");
			System.out.print(vo1.getLoc()+"\n");
		}
	}
	//insert deptno, dname, loc입력
	public DeptVo deptAdd(Scanner sc) {
		System.out.println("\n부서 정보");
		System.out.print("부서번호 >>");
		int deptno = Integer.parseInt(sc.nextLine());
		System.out.print("부서명 >> ");
		String dname = sc.nextLine();
		System.out.print("부서위치 >> ");
		String loc = sc.nextLine();
		
		DeptVo vo = new DeptVo();
		vo.setDeptno(deptno);
		vo.setDname(dname);
		vo.setLoc(loc);
		
		return vo;
	}
	//insert 실패 
	public void printAddFailMessage() {
		System.out.println("입력 실패");
	}
	//insert 성공
	public void printAddSussessMessage() {
		System.out.println("입력 성공");
	}
	public DeptVo deptUpdate(Scanner sc) {
//		System.out.println("\n부서 정보 수정");
//		System.out.println("수정할 부서 번호 입력 >> ");
//		int deptno = Integer.parseInt(sc.nextLine());
//		System.out.println("수정할 지역명 입력 >> ");
//		String loc = sc.nextLine();
//		
//		DeptVo vo = new DeptVo();
//		vo.getDeptno();
//		vo.getLoc();
//		

		System.out.println("\n부서 정보 수정");
		DeptVo vo = new DeptVo();
		System.out.println("수정할 부서 번호 입력 >> ");
		vo.setDeptno(Integer.parseInt(sc.nextLine()));
		System.out.println("수정할 지역명 입력 >> ");
		vo.setLoc(sc.nextLine()); 
		
		return vo;
	}
	//update 실패 
	public void printUpdateFailMessage() {
		System.out.println("수정 실패");
	}
	//update 성공
	public void printUpdateSussessMessage() {
		System.out.println("수정 성공");
	}
	public int deptRemove(Scanner sc) {
		System.out.println("\n부서 정보 삭제");
		System.out.println("삭제할 부서 번호 입력 >> ");
		int deptno = Integer.parseInt(sc.nextLine());
		
		return deptno;
	}
	//delete 실패 
	public void printDeleteFailMessage() {
		System.out.println("삭제 실패");
	}
	//update 성공
	public void printDeleteSussessMessage() {
		System.out.println("삭제 성공");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
