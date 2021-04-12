package ch3;

import java.util.Scanner;

public class BankEx1 {

	public static void main(String[] args) {
//		boolean run = true;
//		
//		//잔액
//		int balance = 0;
//		int num = 0;
//		Scanner sc = new Scanner(System.in);
//		int add=0,min=0;
//		while(run) {
//			System.out.println("---------------------");
//			System.out.println("1.예금|2.출금|3.잔고|4.종료");
//			System.out.println("---------------------");
//			System.out.println("선택 >>");
//			
//			//예금액 입력받기
//			num = sc.nextInt();
//			//1번 : 잔액 =잔액 +예금액
//			if(num==1) {
//				System.out.println("예금할 금액을 입력하세요");
//				add=sc.nextInt();
//				balance+=add;
//				System.out.println("기존 잔액 : "+balance+"\n예금액 : "+add);
//				System.out.println("현재 잔액 : "+balance);
//			}//2번 : 출금액 입력 => 잔액 = 잔액-출금
//			else if(num==2) {System.out.println("출금할 금액을 입력하세요");
//				min=sc.nextInt();
//				balance-=min;
//				System.out.println("기존 잔액 : "+balance+"\n예금액 : "+min);
//				System.out.println("현재 잔액 : "+balance);
//			}//3번 : 현재까지의 잔액 출력
//			else if(num==3) {
//				System.out.println("현재 잔액 : "+balance);
//			}//4번 : 프로그램 종료
//			else if(num==4) {
//				run=false;
//			}else {
//				System.out.println("잘못 입력하셨습니다.다시 입력해 주세요");
//			}
//
//		}
//		System.out.println("종료!");
		
		boolean run = true;
		
		//잔액
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("---------------------");
			System.out.println("선택 >>");
			
			
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("예금액 >>");
				balance +=sc.nextInt();
				break;
			case 2:
				System.out.println("출금액 >>");
				balance -=sc.nextInt();
				break;
			case 3:
				System.out.println("잔고 >>"+balance);
				
				break;
			case 4:
				run=false;
			}	
			}
		System.out.println("종료");	
	}

}
