package ch12;

public class StringEx7 {
	public static void main(String[] args) {
		String str1 ="abcdegfhijkl";
		
		//실습
		//str선언된 것 중에 문자열을 char배열로 돌려주는 배열
		char[] str2=str1.toCharArray();
		for(char ch:str2) {
			System.out.printf(ch+" ");
		}
	}
}
