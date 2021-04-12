package ch3;

import java.util.Scanner;

public class IfEx9 {
	public static void main(String[] args) {
		// 시간당 급여 계산 출력하기
		// 시간당 급여 :5000
		// 근무시간 입력받기
		// 근무시간이 8시간 초과시 원래 임금의 1.5배를 주고, 
		// 근무시간이 8시간까지는 원래대로 5000
//		Scanner sc = new Scanner(System.in);
//		System.out.println("근무시간을 입력하세요");
//		
//		
//		int time = sc.nextInt();
//		int overtime = time-8;
//		int result=0; 
//		
//		if(time <= 8) {
//			result=time*5000;
//		}else{
//			result=8*5000+(time-8)*5000*15/10;
//		}
//		System.out.println(result);	
		
		int rate=5000;
		Scanner sc = new Scanner(System.in);
		System.out.println("근무시간 입력 : ");
		int hours = sc.nextInt();
		int pay=0;
		if(hours>8) {
			pay =(int)(rate*(hours-8)*1.5)+rate*8;
		}else {
			pay = rate * hours;
		}
		System.out.println("받는 임금 : "+pay);
	}

}
