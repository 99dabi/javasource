package user;

import java.util.List;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		boolean isStop = true;
		Scanner sc = new Scanner(System.in);
		
		while(isStop) {
			System.out.println("======회원 관리 프로그램======");
			System.out.println("1.회원 등록");
			System.out.println("2.특정 회원조회");
			System.out.println("3.전체 회원조회");
			System.out.println("4.회원 수정");
			System.out.println("5.회원 탈퇴");
			System.out.println("6.프로그램 종료");
			System.out.println("메뉴 번호 : ");
			int menu = Integer.parseInt(sc.nextLine()); 
			
			switch (menu) {
			case 1:
				System.out.println("회원 등록 >> ");
				System.out.print("username : ");
				String username = sc.nextLine();
				System.out.print("birthyear : ");
				int birthyear =Integer.parseInt(sc.nextLine()); 
				System.out.print("addr : ");
				String addr = sc.nextLine();
				System.out.print("mobile : ");
				String mobile = sc.nextLine();
				
				UserAddService userAdd = new UserAddService();
				boolean isAdd = userAdd.add(username, birthyear, addr, mobile);
				System.out.println(isAdd?"입력 완료":"입력 실패");
				break;
			case 2:
				System.out.println("특정 회원 조회 >> ");
				System.out.print("no : ");
				int no =Integer.parseInt(sc.nextLine());
				
				UserSelectOneService userSelect= new UserSelectOneService();
				UserVO vo = userSelect.getUser(no);
				System.out.println("no\tusername\tbirthyear\taddr\tmobile");
				System.out.print(vo.getNO()+"\t");
				System.out.print(vo.getUsername()+"\t");
				System.out.print(vo.getBirthyear()+"\t");
				System.out.print(vo.getAddr()+"\t");
				System.out.print(vo.getMobile()+"\t");
				System.out.println();
				break;
			case 3:
				System.out.println("전체 회원 조회 >> ");
				
				UserSelectAllService allService = new UserSelectAllService();
				List<UserVO> list = allService.listAll();
				System.out.println("no\tusername\tbirthyear\taddr\tmobile");
				for(UserVO voL:list) {
					System.out.print(voL.getNO()+"\t");
					System.out.print(voL.getUsername()+"\t");
					System.out.print(voL.getBirthyear()+"\t");
					System.out.print(voL.getAddr()+"\t");
					System.out.print(voL.getMobile()+"\t");
					System.out.println();
				}
				break;
			case 4:
				System.out.println("회원 수정 >> ");
				System.out.println("no : ");
				no = Integer.parseInt(sc.nextLine());
				System.out.println("addr : ");
				addr = sc.nextLine();
				System.out.println("mobile : ");
				mobile = sc.nextLine();
				
				UserUpdateService updateService = new UserUpdateService();
				boolean isUpdate = updateService.updateUser(no, addr, mobile);
				System.out.println(isUpdate?"수정 완료":"수정 실패");
				break;
			case 5:
				System.out.println("회원 탈퇴 >> ");
				System.out.print("no : ");
				no = Integer.parseInt(sc.nextLine());
				
				UserDeleteService userDelete = new UserDeleteService();
				System.out.println(userDelete.delete(no)?"탈퇴 성공":"탈퇴 실패");
				break;
			case 6:
				isStop=false;
				System.out.println("프로그램 종료 . ");
				break;

			default:
				System.out.println("잘못입력하셨습니다. ");
				break;
			}
			
		}
	}
}
