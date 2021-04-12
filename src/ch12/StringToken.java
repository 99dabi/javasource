package ch12;

import java.util.StringTokenizer;

public class StringToken {
	public static void main(String[] args) {
		StringTokenizer token = new StringTokenizer("This is a test");
		//token.hasMoreTokens() : boolean형으로 끝나는 메소드
		while(token.hasMoreTokens()){
			//token.nextToken()
			//괄호에 다른 문자를 넣지 않으면 공백을 기준으로 분리 된다.
			System.out.println(token.nextToken());	
		}
	}
}
