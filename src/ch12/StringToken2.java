package ch12;

import java.util.StringTokenizer;

public class StringToken2 {
	public static void main(String[] args) {
		//1.번
		//StringTokenizer token = new StringTokenizer("This/is/a/test");
		//2.번
		StringTokenizer token = new StringTokenizer("This/is/a/test","/");
		//token.hasMoreTokens() : boolean형으로 끝나는 메소드
		while(token.hasMoreTokens()){
			//token.nextToken()
			//괄호에 다른 문자를 넣지 않으면 
			//1.번 
			//System.out.println(token.nextToken("/"));
			//2.번 
			System.out.println(token.nextToken());
		}
	}
}
