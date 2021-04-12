package ch1;

// 자동 타입 변환(Promotion) 연산
// byte < short < int < long < float < double
// 큰 타입 = 작은 타입
public class PromotionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue=10, byteValue2=20;// byte 타입 선언
		
		//큰 타입(4byte) = 작은 타입(1byte)
		int intValue=byteValue+byteValue2;
		System.out.println(intValue);
		// 작은 타입 = 큰 타입( x )
		//byte byteResult = byteValue + byteValue2;//자동 타입 변환 불가능
		int byteResult=byteValue + byteValue2;
		System.out.println(byteResult);
		
		double doubleValue=5.5;
		//int result = intValue + doubleValue;//오류
		double result = intValue + doubleValue;
		//더하기를 하는경우에도 큰 타입으로 자동 형변환됨
		
		
		char charValue1='A';
		char charValue2=1;
		//char resultValue = charValue1 + charValue2;//오류남 
		int resultValue= charValue1 + charValue2;//큰타입으로 맞춰주어야 처리 가능
		System.out.println(resultValue);
				
		
		
		
	}

}
