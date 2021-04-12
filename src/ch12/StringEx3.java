package ch12;

public class StringEx3 {
	public static void main(String[] args) {
		String str1 ="자바 프로그래밍";
		
		//결과값 : 0 //몇번째 있는지 
		System.out.println(str1.indexOf("자바"));
		
		//결과값 : -1 // 들어있지 않아 -1
		System.out.println(str1.indexOf("베이직"));
		
		//결과값 : 5
		System.out.println(str1.indexOf("그"));
		
		System.out.println(str1.indexOf("프"));
		
		String str2 = "hello";
		System.out.println("o 문자 위치 : "+str2.indexOf('o'));
		//str2.indexOf(찾는 문자, 시작위치) 
		System.out.println("el 문자 위치 : "+str2.indexOf("el",2));
		
		String str3 ="HelloHelloHello World";
		System.out.println("l문자 위치 : "+str3.indexOf('l'));
		System.out.println("l문자 위치 : "+str3.lastIndexOf('l'));
		
		if(str1.indexOf("프")>=0) {
			System.out.println("들어 있다.");
		}else {
			System.out.println("없다.");
		}
	}
}
