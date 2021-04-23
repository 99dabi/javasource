package sequence;

import java.util.List;
import java.util.Scanner;

import jdbc.EmpVO;

public class MemberMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		MemberDAO dao = new MemberDAO();
		
		String userName;
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1.회원 등록");
			System.out.println("2.회원 조회");
			System.out.println("3.회원 전체 조회");
			System.out.println("4. 종료");
			System.out.println("-----------------------------------");
			System.out.println("메뉴 선택 >> ");
			int menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				System.out.println("\n회원 등록");
				System.out.print("이름 >> ");
				userName = sc.nextLine();
				System.out.println(dao.insert(userName)?"회원 등록 성공":"회원 등록 실패");
				break;
			case 2:
				System.out.println("\n회원 조회");
				System.out.print("번호 >> ");
				int userNo =Integer.parseInt(sc.nextLine()) ;				
				MemberVO vo1 = dao.getRow(userNo);
				System.out.println("번호\t 이름");
				if(vo1!=null) {
				System.out.print(vo1.getUserNo()+"\t");
				System.out.print(vo1.getUserName()+"\n");
				
				}else {
					System.out.println(" 사원번호를 확인해 주세요 ");
				}
				
				break;
			case 3:
				System.out.println("\n회원 전체 정보");
				System.out.println("번호\t 이름");
				List<MemberVO> list = dao.getList();
				for(MemberVO vo :list) {
					System.out.print(vo.getUserNo()+"\t");
					System.out.println(vo.getUserName());
					
				}System.out.println();
				break;
			case 4:
				run=false;
				break;

			default:
				System.out.println("메뉴 번호를 확인해 주세요");
				break;
			}
			
			
			
		}
		
	}
}
