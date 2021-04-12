package ch2;

public class ArithmeticOperEx2 {
	public static void main(String[] args) {
		//값을 입력하기 전이라 코드값으로 바뀌어서 들어감
		char c1 = 'A'+1; //A=65 65+1=>'B' 
		 
		char c2 = 'A';
		
		
		//Cannot convert from int to char
		//char 타입의 변수 +1
		//byte +byte =int
		//short +short =int
		//char c3 =c2+1;//연산을 하게 되면 int로 인식이 됨 
		int c3 =c2+1;		
		
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
		System.out.println("c3="+(char)c3);
	}
}
