package user2;

import java.util.List;
import java.util.Scanner;



public class ConsoleUtil {
	//add
	public UserVO userAdd(Scanner sc) {
		UserVO vo = new UserVO();
		System.out.println("회원 등록 >> ");
		System.out.print("username : ");
		vo.setUsername(sc.nextLine());
		System.out.print("birthyear : ");
		vo.setBirthyear(Integer.parseInt(sc.nextLine()));  
		System.out.print("addr : ");
		vo.setAddr(sc.nextLine());
		System.out.print("mobile : ");
		vo.setMobile(sc.nextLine());
		return vo;
	}
	public void printAddSussessMessage() {
		System.out.println("입력 성공");
	}public void printAddFailMessage() {
		System.out.println("입력 실패");
	}//add end
	//selectOne start
	public int userNo(Scanner sc) {
		System.out.println("특정 회원 조회 >> ");
		System.out.print("no : ");
		int no =Integer.parseInt(sc.nextLine());
		 return no;
	}public void printFailMessage() {
		System.out.println("조회 실패");
	}public void printSussessMessage(UserVO vo) {
		System.out.println("no\tusername\tbirthyear\taddr\tmobile");
		System.out.print(vo.getNO()+"\t");
		System.out.print(vo.getUsername()+"\t");
		System.out.print(vo.getBirthyear()+"\t");
		System.out.print(vo.getAddr()+"\t");
		System.out.print(vo.getMobile()+"\t");
		System.out.println();
	}//selectOne end
	//select start
	public void userSelect() {
		System.out.println("전체 회원 조회 >> ");
		
	}public void printSelectFailMessage() {
		System.out.println("전체 회원 조회 실패");
	}public void printSelectSussessMessage(List<UserVO> list) {
		System.out.println("no\tusername\tbirthyear\taddr\tmobile");
		for(UserVO voL:list) {
			System.out.print(voL.getNO()+"\t");
			System.out.print(voL.getUsername()+"\t");
			System.out.print(voL.getBirthyear()+"\t");
			System.out.print(voL.getAddr()+"\t");
			System.out.print(voL.getMobile()+"\t");
			System.out.println();
		}
	}//select end
	//update start
	public UserVO userUpdate(Scanner sc) {
		UserVO vo = new UserVO();
		System.out.println("회원 수정 >> ");
		System.out.println("no : ");
		vo.setNO(Integer.parseInt(sc.nextLine()));
		System.out.println("addr : ");
		vo.setAddr(sc.nextLine());
		System.out.println("mobile : ");
		vo.setMobile(sc.nextLine());
		return vo;
	}public void printUpdateFailMessage() {
		System.out.println("수정 실패");
	}public void printUpdateSussessMessage(int no) {
		System.out.println(no+"번 수정 성공");
	}//upadte end
	//delete start
	public int userDelete(Scanner sc) {
		System.out.println("회원 탈퇴 >> ");
		System.out.print("no : ");
		int no = Integer.parseInt(sc.nextLine());
		return no;
	}public void printDeleteFailMessage() {
		System.out.println("탈퇴 실패");
	}
	public void printDeleteSussessMessage() {
		System.out.println("탈퇴 성공");
	}//delete end
	
	
	
	
	
	
	
	
	
	
	
}
