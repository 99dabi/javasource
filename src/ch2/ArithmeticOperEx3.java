package ch2;

public class ArithmeticOperEx3 {

	public static void main(String[] args) {
		long x = 1000000;
		long y = 1000000;
		
		//int z = x*y;//int가 담을 수 있는 범위를 넘어가서 이상한 값이 나옴
		//long z =(long)x*y; // 계산값도 바꿔줘야 함.
		long z = x*y;
		System.out.println( "z = "+z);

	}

}
