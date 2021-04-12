package ch12;

public class StringEx5 {
	public static void main(String[] args) {
		String str1 ="자바는 객체지향 언어입니다. 자바는 풍부한 API를 제공합니다.";
		//String 클래스는 불변-처음생성한 객체는 불변
		//기존의 단어 제거하고 다시 만들어서 담는 것
		//replace를 사용하게 되도 기존의 문자는 못바꾼다
		//다시 담는 것이 중요함
		//String str2=str1.replace("자바", "java");
		str1.replace("자바", "java");
		System.out.println(str1);
		
		str1= str1.replaceFirst("java", "자바");
		System.out.println(str1);
		
		
		String str2="hello";
		String str3="hello";
		String str4="Hello";
		//대소문자 구분
		System.out.println(str2.equals(str3));
		System.out.println(str2.equals(str4));
		System.out.println(str2.equalsIgnoreCase(str3));
		System.out.println(str2.equalsIgnoreCase(str4));
	}
}
