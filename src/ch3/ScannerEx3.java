package ch3;

import java.util.Scanner;

public class ScannerEx3 {

	public static void main(String[] args) {
		
		//※실행하게 되면 연산자가 입력이 안되는 오류가 발생함
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수 입력 : ");
		int op1 = sc.nextInt();//※35 엔터
		
		System.out.print("연산자(+,-,*,/) 입력 : ");
		//String str = sc.nextLine();//※\n 기준으로 읽는데 위의 \n이 있어서 있는걸로 인식 됨 
		String str = sc.next();//공백 기준 읽어온다
		
		System.out.print("두번째 수 입력 : ");
		int op2 = sc.nextInt();
		
		System.out.printf("%d %s %d = ",op1,str,op2);
	}

}
