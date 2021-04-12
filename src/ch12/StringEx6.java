package ch12;

public class StringEx6 {
	public static void main(String[] args) {
		String ssn = "8980815-1234567";
		
		//substring(시작위치,끝나는 위치) : 문자열 추출 
		System.out.println(ssn.substring(0));
		System.out.println(ssn.substring(0, 6));
		
		//숫자를 문자로 바꾸는 방법
		//int => String 10+""
		//				String.valueOf(10)
		System.out.println(String.valueOf(false));//"false"
		System.out.println(String.valueOf(10.5));//"10.5"
		System.out.println(String.valueOf(12));//"12"
		System.out.println(String.valueOf('c'));//"c"
		
		//join()
		String str1=String.join("-","java","is","cool");
		System.out.println(str1);
		
		//compareTo() : 문자열을 사전 순서로 비교
		//
		String str2 ="aaa";//97
		String str3 ="bbb";//98
		String str4 ="ccc";//99
		
		System.out.println(str2.compareTo(str3));//-1 = 97-98
		System.out.println(str3.compareTo(str2));//1 =98-97
		
		System.out.println(str2.compareTo(str4));//-2
		
		//toUpperCase, toLowerCase =>대문자와 소문자로 변경
		String str5="abcdefg";
		System.out.println(str5.toUpperCase());
		String str6 = "ABCDEFG";
		System.out.println(str6.toLowerCase());
				
		//trim() : 좌, 우 공백제거
		//"        abc".trim().equals("abc")
		String str7 = "         AB       deFG    ";
		System.out.println(str7);
		System.out.println(str7.trim()); 
	}
}
