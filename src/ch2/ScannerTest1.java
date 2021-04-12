package ch2;

import java.util.Scanner;

public class ScannerTest1 {
	public static void main(String[] args) {
		//사용자에게 정수를 입력받아 그 숫자가 짝수인지 홀수인지 판별
		//키보드에서 입력받는다 =>system.in
		Scanner sc= new Scanner(System.in);
		//사용자에게 보여주는 칸
		System.out.println("숫자 입력 : ");
		int num = sc.nextInt();
		String result = (num%2==0)? "짝수" : "홀수";
		System.out.println("숫자 "+num+"의 결과는 "+result+"입니다.");

	}

}
