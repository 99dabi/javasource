package ch2;

public class ArithmeticOperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1=5;
		int v2=2;
		 
		int result1 = v1+v2;
		System.out.println("result1 = "+result1);
		
		int result2 = v1-v2;
		System.out.println("result2 = "+result2);
		
		int result3 = v1*v2;
		System.out.println("result3 = "+result3);
		
		int result4 = v1/v2;//몫 출력
		System.out.println("result4 = "+result4);
		
		int result5 = v1%v2;//나머지 출력
		System.out.println("result5 = "+result5);
	
		double result6 = v1/v2;
		//int형으로 먼저 나누고 넣는거라 나머지까지 출력은 안됨
		System.out.println("result6 = "+result6);
		
		double result7 = (double)v1/v2;
		//연산을 할때 casting한것이라 실수로 값이 나온다
		System.out.println("result7 = "+result7);
	}
}
