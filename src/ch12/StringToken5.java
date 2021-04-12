package ch12;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken5 {
	public static void main(String[] args) {
		//키보드로 문자열을 읽어 "/"문자로 분리 하는 프로그램 작성
		Scanner scanner = new Scanner(System.in);
		System.out.println("문장을 입력하세요");
		String str= scanner.nextLine();
		//예시) 아빠/엄마/수연/연수/수희
		StringTokenizer st = new StringTokenizer(str,"/");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
			
	}
}
