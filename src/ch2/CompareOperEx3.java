package ch2;

public class CompareOperEx3 {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		
		System.out.println(str1==str2);
		//문장을 어떻게 만들었냐에 따라 결과가 다름
		System.out.println(str1==str3);	
		
		//문자열 비교 equals
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		}

}
