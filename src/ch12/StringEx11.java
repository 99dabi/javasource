package ch12;

public class StringEx11 {

	public static void main(String[] args) {
		
		StringBuilder builder1 = new StringBuilder("Hello");
		StringBuilder builder2 = new StringBuilder("Hello");

		String str1= builder1.toString();//
		String str2 = builder2.toString();
		System.out.println("1=============");
		System.out.println(str1.equals(str2));//true오버라이딩 되어있음
		//String
		System.out.println(builder1.equals(builder2));//false
		System.out.println("2=============");
		//insert, delete, replace=>문자열의 변경
		
		StringBuilder sb1 = new StringBuilder("Java");
		sb1.append("Programming");
		System.out.println(sb1);
		System.out.println("3=============");
		sb1.insert(4, "Test");
		System.out.println("insert 후 : "+sb1);
		System.out.println("4=============");
		sb1.replace(6, 10, " Book ");//원본이 변경됨
		System.out.println("replace 후 : "+sb1);
		System.out.println("5=============");
		
		
		
		StringBuilder sb2 = new StringBuilder("abcdefg");
		sb2.delete(0, 3);
		System.out.println(sb2);
		System.out.println("6=============");
		sb2.deleteCharAt(0);
		System.out.println(sb2);
	}

}
