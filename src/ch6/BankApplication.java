package ch6;

import java.util.Scanner;

public class BankApplication {
	//속성 (인스턴스필드, 프로퍼티..)
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//int i=0;
		boolean run = true;
		while(run) {
			
			System.out.println("-------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.print("선택 > ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			switch (selectNo) {
			case 1:
//				createAccount(i);
//				i++;
				createAccount();//하나의 클래스 내에서 내것을 부를때
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run=false;
				break;
			}
		}
	System.out.println("시스템 종료");
	}
//	private static void createAccount() {
//		// 계좌번호, 계좌주, 잔액 입력 받기
//		String accNo=" ",accOwner=" ";
//		int balance=0;
//		System.out.print("계좌번호 입력 : ");
//		accNo=sc.next();
//		
//		System.out.print("계좌주 입력 : ");
//		accOwner=sc.next();
//		
//		System.out.print("잔액 입력 : ");
//		 balance=Integer.parseInt(sc.next());
//		//Account객체 생성
//		 accountArray[i]=new Account(accNo,accOwner,balance);
//		//accountArray 에 생성된 객체 담기
//		System.out.printf("%d 번 계좌번호 : %s 계좌주 : %s 잔액 : %d",
//				i,accountArray[i].getAno(),accountArray[i].getOwner(),
//				accountArray[i].getBalance());
//		System.out.println();
//		}
//	private static void accountList() {
//			//accountArray 계좌목록 보기
//		for(int i=0;i<accountArray.length;i++) {
//			//accountArray 에 생성된 객체 담기
//			if(accountArray[i]!=null) {
//				System.out.printf("%d 번 계좌번호 : %s 계좌주 : %s 잔액 : %d",
//						i,accountArray[i].getAno(),accountArray[i].getOwner(),
//						accountArray[i].getBalance());
//				System.out.println();	
//			}else {System.out.println();
//				break;
//			}
//		}
//	}
//	//예금하기
//	private static void deposit() {
//		//사용자한테 계좌번호 입력받기
//		System.out.println("계좌번호를 입력해 주세요");
//		String ano = sc.nextLine();
//		Account acc=findAccount(ano);
//		
//		//예금액 입력받기
//		System.out.println(acc.getOwner()+"님 예금액을 입력해 주세요 : ");
//		int accDeposit= Integer.parseInt(sc.nextLine());
//		//잔액 = 잔액+예금액
//		int oldDeposit=acc.getBalance();
//		acc.setBalance(oldDeposit+accDeposit);
//		System.out.println("예금액 : "+oldDeposit+"+"+accDeposit+"="+acc.getBalance());
//	}
//	//Account 배열에서 ano와 동일한 Account 객체 찾기
//	private static Account findAccount(String ano) {
//		int j=10000;
//		//ano와 일치하는 Account 가 배열의 몇번째에 존재하는지 확인하고
//		for(int i=0;i<accountArray.length;i++) {
//			if(accountArray[i].getAno().equals(ano)) {
//				j=i;
//				
//				break;
//			}
//		}
//		//리턴
//			return accountArray[j];
//	}	
	
//	//출금하기
//		private static void withdraw() {
//			//사용자 한테 계좌번호 입력받기
//			System.out.println("계좌번호를 입력해 주세요 : ");
//			String ano= sc.nextLine();
//			//findAccount()
//			Account acc=findAccount(ano);
//			if(acc!=null) {
//			//출금액 입력받기
//			System.out.println("출금액을 입력해 주세요 : ");
//			int drawAcc = Integer.parseInt(sc.nextLine());
//
//			//잔액= 잔액-출금액
//			if((acc.getBalance()-drawAcc)>0) {
//				acc.setBalance(acc.getBalance()-drawAcc);
//				System.out.println("현재 금액 : "+acc.getBalance());
//				}else {
//					System.out.println("금액이 오버되어 실행할 수 없습니다.");
//				}
//			}else {
//				System.out.println("계좌번호를 다시입력해 주세요");
//			}
//		}
//---------------------------------------------------------------------------
		private static void createAccount() {	
		// 계좌번호, 계좌주, 잔액 입력 받기
		System.out.println("계좌번호 입력");
		String ano = sc.nextLine();
		System.out.println("계좌주 입력");
		String owner = sc.nextLine();
		System.out.println("잔액 입력");
		int balance = Integer.parseInt(sc.nextLine());
		//Account객체 생성
		for(int i=0;i<accountArray.length;i++) {
			//accountArray 에 생성된 객체 담기
			if(accountArray[i]==null) {
				accountArray[i]=new Account(ano, owner, balance);
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}
	}
		private static void accountList() {
			//계좌번호, 계좌주, 잔액 입력 받기
			System.out.println("--------------");
			System.out.println("계좌번호 계좌주  잔액");
			System.out.println("--------------");
			
			for(Account account:accountArray) {
				if(account!=null) {
					System.out.printf("%s\t%s\t%d\n"
							,account.getAno(),account.getOwner(),
							account.getBalance());
				}
			}	
		}
		//예금하기
		private static void deposit() {
			//사용자한테 계좌번호 입력받기
			System.out.println("입금할 계좌번호 입력");//210-12-13
			String ano = sc.nextLine();
			Account acc=findAccount(ano);//넘어감
			//예금액 입력받기
			if(acc != null) {
				System.out.println("예금액 : ");
				int balance = Integer.parseInt(sc.nextLine());
				//잔액 = 잔액+예금액
				acc.setBalance(acc.getBalance()+balance);
				System.out.println(acc.getBalance());
			}else {
				System.out.println("계좌번호를 확인해 주세요");
			}
	}
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {//계좌번호가 넘어옴
		//ano와 일치하는 Account 가 배열의 몇번째에 존재하는지 확인하고
		Account findAcc = null;
		for(Account acc:accountArray) {
			if(acc!=null) {
				if(acc.getAno().equals(ano)) {//문자열 비교할때는 ==(x) equals(ano)
					findAcc=acc;
				}
			}
		}
		//리턴
		return findAcc;
	}
	
	//출금하기
	private static void withdraw() {
		//사용자 한테 계좌번호 입력받기
		System.out.println("계좌번호를 입력해 주세요 : ");
		String ano= sc.nextLine();
		//findAccount()
		Account acc=findAccount(ano);
		if(acc!=null) {
		//출금액 입력받기
		System.out.println("출금액을 입력해 주세요 : ");
		int drawAcc = Integer.parseInt(sc.nextLine());

		//잔액= 잔액-출금액
		if((acc.getBalance()-drawAcc)>0) {
			acc.setBalance(acc.getBalance()-drawAcc);
			System.out.println("현재 금액 : "+acc.getBalance());
			}else {
				System.out.println("금액이 오버되어 실행할 수 없습니다.");
			}
		}else {
			System.out.println("계좌번호를 다시입력해 주세요");
		}
	}

}
