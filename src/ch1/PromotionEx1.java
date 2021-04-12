package ch1;

// 자동 타입 변환(Promotion)
// byte < short < int < long < float < double
// 큰 타입 = 작은 타입
public class PromotionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue=10;// byte 타입 선언
		
		//큰 타입(4byte) = 작은 타입(1byte)
		int intValue=byteValue;
		System.out.println(intValue);
		
		char charValue='가';
		//큰 타입(4byte) = 작은 타입(2byte)
		intValue=charValue;
		System.out.println(charValue);
		
		intValue=200;
		//큰 타입(8byte) = 작은 타입(4byte)
		double doubleValue=intValue;
		//단 double형으로 변형되어 소수점을 가진다
		System.out.println(doubleValue);
		
	}

}
