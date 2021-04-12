package ch3;

import java.util.Scanner;

public class ScannerEx4 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수 입력 : ");
		int op1 = Integer.parseInt(sc.nextLine());
		//문자숫자 "35" => 숫자 35
		
		
		System.out.print("연산자(+,-,*,/) 입력 : ");
		String str = sc.nextLine();
		//String str = sc.next();//공백 기준 읽어온다
		
		System.out.print("두번째 수 입력 : ");
		int op2 = Integer.parseInt(sc.nextLine());
		
		System.out.printf("%d %s %d = ",op1,str,op2);
	}
//line으로 받으면 op1이 숫자가 아닌 문자로 인식되기 때문에 
//해결책으로 Inteager.parseInt를 사용해 int형으로 바꾼다
	
}
