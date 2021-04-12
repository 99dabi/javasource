package ch3;

import java.util.Scanner;

public class IfEx8 {
	public static void main(String[] args) {
		// 사용자에게 값을 입력받아 홀수,짝수인지 출력하기(if~else)
		Scanner sc  = new Scanner(System.in);
		System.out.println("값을 입력하세요 : ");
		
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("짝수입니다.");
		}else{
			System.out.println("홀수입니다.");
		}
	}

}
