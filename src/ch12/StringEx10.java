package ch12;

public class StringEx10 {
	public static void main(String[] args) {
		String str1 = "Hello World";
		
		StringBuffer buffer = new StringBuffer(str1);
		
		StringBuilder builder = new StringBuilder(str1);
		
		//원본문자열 뒤에 새로운 문자열
		str1+="안녕하세요!! 반갑습니다.";
		//append : 뒤에 연결하는것
		buffer.append("StringBuffer");
		builder.append("StringBuilder");
		System.out.println(str1);
		System.out.println(buffer);
		System.out.println(builder);
	}
}
