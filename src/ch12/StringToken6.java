package ch12;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken6 {
	public static void main(String[] args) {
		//사용자로부터 문자열을 입력 받아 공백으로 분리된 어절이 몇 개인지 출력하기
		//exit가 들어오면 프로그램 종료
		Scanner sc = new Scanner(System.in);
		String input="";
		//예시)오늘은 금요일 입니다. =>
		boolean run=true;
		while (run) {
			System.out.println("문장을 입력하세요");
			input= sc.nextLine();
			if(input.equals("exit")) {
				run=false;	
			}else {
				StringTokenizer st = new StringTokenizer(input);
				System.out.println("분리된 어절 수 : "+st.countTokens());
				while(st.hasMoreTokens()) {
					System.out.println(st.nextToken());
				}
			}			
		}
	}
}

