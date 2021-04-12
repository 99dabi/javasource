package ch3;

import java.util.Scanner;

public class SwitchEx7 {

	public static void main(String[] args) {
		// 사용자에게 점수 입력받기
		//해당 점수에 따라 A~F까지 등급 출력
		
		Scanner sc=new Scanner(System.in);
//		System.out.println("점수를 입력해 주세요 : ");
//		int score = sc.nextInt();
//		char grade=' ';
//		switch (score/10) {
//		case 9:
//			grade='A';
//			break;
//		case 8:
//			grade='B';
//			break;
//		case 7:
//			grade='C';
//			break;
//		default:
//			grade='F';
//			break;
//		}
//		System.out.println("성적이 "+score+"이므로, ");
//		System.out.println("등급은 "+grade+"입니다. ");
		System.out.println("점수 입력 : ");
		int jumsu = sc.nextInt();
		switch (jumsu/10) {
		case 9:case 10:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
			break;
		}

	}

}
