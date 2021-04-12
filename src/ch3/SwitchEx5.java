package ch3;

import java.util.Scanner;

public class SwitchEx5 {

	public static void main(String[] args) {
		//가위 바위 보 게임
		//사용자가 내는 가위(1) 바위(2) 보(3)
		//컴퓨터가 내는 부분 =>Math.random 추출
		//누가 이겼는지 출력하기
		Scanner sc  = new Scanner(System.in);
//		System.out.println("가위 바위 보 게임");
//		System.out.println("1. 가위");
//		System.out.println("2. 바위");
//		System.out.println("3. 보");
//		int player = sc.nextInt();
//		int cp = (int)(Math.random()*3+1);
//		
//		System.out.println("컴퓨터가 낸값 : "+cp);
//		
//		
//		switch (player) {
//		case 1:
//			switch (cp) {
//			case 1:
//				System.out.println("비김");
//				break;
//			case 2:
//				System.out.println("패");
//				break;
//			default:
//				System.out.println("승");
//				break;
//			}
//			break;
//		case 2:
//			switch (cp) {
//			case 1:
//				System.out.println("승");
//				break;
//			case 2:
//				System.out.println("비김");
//				break;
//			default:
//				System.out.println("패");
//				break;
//			}
//			break;
//		default:
//			switch (cp) {
//			case 1:
//				System.out.println("패");
//				break;
//			case 2:
//				System.out.println("승");
//				break;
//			default:
//				System.out.println("비김");
//				break;
//			}
//			break;
//		}
//		
		System.out.println("가위 바위 보 입력하세요.");
		int user = sc.nextInt();
		int computer=(int)(Math.random()*3+1);
		
		switch (user-computer) {
		case 2: case -1:
			System.out.println("당신이 졌습니다.");
			break;
		case 1: case -2 : 
			System.out.println("당신이 이겼습니다.");
			break;
		default:
			System.out.println("비겼습니다.");
			break;
		}
	}

}
