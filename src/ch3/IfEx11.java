package ch3;

import java.util.Scanner;

public class IfEx11 {

	public static void main(String[] args) {
		// 사용자로부터 3개의 정수를 입력받아 가장 작은 값을 출력하시오
//		Scanner sc= new Scanner(System.in);
//		System.out.println("숫자 3개를 입력 해 주세요");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		int mid_num=0;
//		int result_num=0;		
//		
//		if(num1<num2) {
//			mid_num=num1;
//		}else {
//			mid_num=num2;
//		}
//		if(mid_num<num3) {
//			result_num=mid_num;
//		}else {
//			result_num=num3;
//		}
//		System.out.println("가장작은 값은"+result_num+"입니다.");
		Scanner sc= new Scanner(System.in);
		System.out.println("첫번째 수 입력 : ");
		int num1= sc.nextInt();
		System.out.println("두번째 수 입력 : ");
		int num2= sc.nextInt();
		System.out.println("세번째 수 입력 : ");
		int num3= sc.nextInt();
		
		int min = num1;
		
		if(min >num2) {
			min = num2;
		}
		if(min > num3) {
			min = num3;
		}
		System.out.println("세 숫자 중에서 제일 작은 숫자는 :"+min);
			
		//제일 큰 수를 구하세요
		
		int max = num1;
		if(max <num2) {
			max = num2;
		}
		if(max < num3) {
			max = num3;
		}
		System.out.println("세 숫자 중에서 제일 큰 숫자는 :"+max);
				
	}

}
