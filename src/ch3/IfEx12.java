package ch3;

import java.util.Scanner;

public class IfEx12 {

	public static void main(String[] args) {
		// 사용자로부터 키와 몸무게를 입력받고, 
		// 사용자의 키에 알맞은 표준체중을 계산한 후
		// 표준체중보다 많으면 "과체중",적으면 "저체중",
		// 동일하면 "표준체중"이라는 결과 출력하기
		//표준체중 =(키-100)*0.9 =>int형변환
		Scanner sc =new Scanner(System.in);
//		System.out.println("키와 몸무게를 입력하세요.");
//		
//		int height=sc.nextInt();
//		int weight=sc.nextInt();
//		String result=" ";
//		
//		int Standard = (int) ((height-100)*0.9);
//		
//		if(Standard>weight) {
//			result="저체중";
//		}else if(Standard<weight) {
//			result="과체중";
//		}else {
//			result="표준";
//		}
//		System.out.println("당신의 체중은"+weight+"이고, ");
//		System.out.println("표준 체중은"+Standard+"이므로, ");
//		System.out.println("당신은 "+result+"입니다.");
		System.out.println("키를 입력하세요.");
		int height=sc.nextInt();
		System.out.println("몸무게를 입력하세요.");
		int weight=sc.nextInt();
		
		int standard =(int)((height-100)*0.9);
		
		if(weight>standard) {
			System.out.println("과체중");
		}else if(weight==standard) {
			System.out.println("표준");			
		}else {
			System.out.println("저체중");
		}
		
	
	}
	

}
