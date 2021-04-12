package ch3;

import java.util.Scanner;

public class ForEx10 {

	public static void main(String[] args) {
		//임의의 정수를 입력받아 해당 수의 factorial 구하기
		//4! = 4*3*2*1
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num=sc.nextInt();
		int fac=1;
		
		for(int i=num ;i>=1;i--) {
			fac*=i;
			System.out.println(fac);
		}
		System.out.println(num+" factorial의 값은 : "+fac+"입니다.");
	}

}
