package ch12;

public class StringEx12 {
	public static void main(String[] args) {
		String str1 ="AbZquartKgu";
		
		//문자열 거꾸로 출력하기
	
		for(int i=str1.length()-1;i>=0;i--) {
			System.out.print(str1.charAt(i));
		}System.out.println();		
		
		//str1 => StringBuilder 변경 후 
		//문자열을 거꾸로 출력하는 메소드를 찾아서 
		StringBuilder str2= new StringBuilder(str1);
		System.out.println(str2.reverse());
		
	}		
}
