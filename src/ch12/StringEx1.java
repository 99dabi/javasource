package ch12;

public class StringEx1 {
	public static void main(String[] args) {
		//문자열 객체 생성
		String str = "Hello";
		
		System.out.println(str.charAt(0));
		System.out.println("====================");
		char ch1=str.charAt(2);
		System.out.println(ch1);
		System.out.println("====================");
		System.out.println(str.length());
		System.out.println("====================");
		//for문
		for(int t=0; t<str.length();t++) {
			System.out.println(str.charAt(t));
		}
		
		System.out.println("====================");
		char ch[]= {'H','e','l','l','o'};
		String str2 = new String(ch);
		
		System.out.println(str);
		System.out.println(str2);
		
	}
}
