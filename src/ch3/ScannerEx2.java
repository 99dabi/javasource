package ch3;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		
		//System.out : 화면
		//System.in : 키보드 입력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요 : ");
		
		//nextLine() :  값을 읽어올 때 \n을  기준으로 읽어온다.
		//String num = sc.nextLine();.
		
		//next() : 값을 공백 기준으로 읽어온다
		String num = sc.next();
		
		System.out.println("num = "+num);
	}

}
