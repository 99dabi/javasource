package ch1;

public class LongVariable2 {
	/*
	long 타입	
		메모리 사용 8byte만 사용
		byte =64bit(-2**63~ +2**63-1) : 표현
		byte, char, short, int, long : 정수형 데이터 담을 때 사용=>값의 크기에 따라 다름
		
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long val1=123456789l;//작을때l,L 욥션
//		long val2=100000000000;
		//l안붙이면 컴파일 에러가 남 
		//=>int타입의 저장 범위를 넘어서는 정수 값에서는 L을 반드시 붙어야함		
		long val2=100000000000L;
		long val3= 20l;
		
		System.out.println("val1 = "+val1);
	}

}
