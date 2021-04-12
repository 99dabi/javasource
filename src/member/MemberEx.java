package member;

import java.util.Scanner;

public class MemberEx {
	public static void main(String[] args) {
		
		//new Member().getAge();
		
//		Member member1 = new Member();
//		Member member2 = new Member(2012,"홍길동","서울","대한민국","hong123@naver.com",25);
//		
//		System.out.println(member1);
//		System.out.println(member2);	
		
		boolean run=true;
		Scanner sc=new Scanner(System.in);		
		
		//회원가입,수정,삭제 모든 작업들을 맡기기 위해 필요
		MemberConsoleUtil util = new MemberConsoleUtil();
		
		//여러 명의 회원정보 처리
		Member[] members = new Member[3];
		
		//Member member = new Member(2012,"홍길동","서울","대한민국","hong123@naver.com",25);		
		//members[0] = new Member(2012,"홍길동","서울","대한민국","hong123@naver.com",25);
		
		
		
		while(run) {
			System.out.println();
			System.out.println("===== 회원관리 프로그램 ====");
			System.out.println("1. 회원등록");
			System.out.println("2. 회원목록보기");
			System.out.println("3. 회원정보수정");
			System.out.println("4. 회원정보삭제");
			System.out.println("5. 프로그램 종료");
			System.out.print("메뉴번호 : ");
			int menu=Integer.parseInt(sc.nextLine()); //Integer.parseInt("1") => 1
			
			switch(menu) {
			case 1:
				Member newMember=util.getNewMember(sc);
				//배열에 담기
				for(int i=0;i<members.length;i++) {
					if(members[i]==null) {
						members[i]=newMember;
						break;
					}
				}					
				//System.out.println(newMember);
				util.printAddSuccessMessage(newMember);
				break;
			case 2:
				//배열출력
				util.printMemberList(members);
				break;
			case 3:
				Member updateMember=util.getUpdateMember(sc, members);
				//System.out.println(updateMember);
				if(updateMember!=null)
					util.printModifySuccessMessage(updateMember);
				else
					util.printModifyFailMessage();
				break;
			case 4:
				Member deleteMember=util.removeMember(sc, members);
				if(deleteMember!=null)
					util.printRemoveSuccessMessage();
				else
					util.printRemoveFailMessage();
				break;
			case 5:
				run=false;			
			}
		}

	}
}







