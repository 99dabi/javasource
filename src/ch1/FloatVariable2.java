package ch1;

public class FloatVariable2 {
	/*
	float 타입/ double타입 => 실수형-소수점, 지수 
	4byte =32bit / 8vyte = 64bit	
	부동 소수점 방식으로 저장되기 때문에 int, long과 달리 훨씬 더 큰 범위의 값 저장 가능
		
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//소수점만 사용하는 값이라면 기본적으로, double로 인식됨
		float score = 3e6f;//10의 6승
		double score2 = 3e6d;// d는 옵션
		System.out.println("score ="+score+", score2 ="+score2);
		
	}

}
