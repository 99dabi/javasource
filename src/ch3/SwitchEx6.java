package ch3;

import java.util.Scanner;

public class SwitchEx6 {

	public static void main(String[] args) {
		// 간단 계산기
		//사용자에게 두개의 숫자와 연산자를 입력받기
		//입력받은 값에 의해 계산한 후 출력
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째 숫자를 입력하세요. : ");
//		int num1 = sc.nextInt();
//		System.out.println("두번째 숫자를 입력하세요. : ");
//		int num2 = sc.nextInt();
//
//		System.out.println("연산자를 입력하세요. : ");
//		System.out.println("1:+ \n2:- \n3:* \n4:/ ");
//		int operators = sc.nextInt();
//		
//		switch (operators) {
//		case 1:
//			System.out.println(num1+"+"+num2+"="+num1+num2);
//			break;
//		case 2:
//			System.out.println(num1+"-"+num2+"="+(int)(num1-num2));
//			break;
//		case 3:
//			System.out.println(num1+"*"+num2+"="+num1*num2);
//			break;
//		case 4:
//			System.out.println(num1+"/"+num2+"="+num1/num2);
//			break;
//
//		default:
//			System.out.println("잘못된 값입니다.");
//			break;
//		}
		System.out.println("연산자(+,-,*,/,%) 입력 : ");
		String strOper = sc.nextLine(); // +=> "+"
		//문자열 입력한거 string으로 읽어서 가져옴
		System.out.println("첫번째 숫자 입력 : ");
		int op1 = sc.nextInt();
		System.out.println("두번째 숫자 입력 : ");
		int op2 = sc.nextInt();
		
		int result =0;
		switch (strOper) {
		case "+":
			result =op1+op2;
			break;
		case "-":
			result =op1-op2;
			break;
		case "*":
			result =op1*op2;
			break;
		case "/":
			result =op1/op2;
			break;
		case "%":
			result =op1%op2;
			break;
		}
		System.out.printf("%d %s %d = %d",op1,strOper,op2,result);
	}
}
