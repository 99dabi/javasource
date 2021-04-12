package ch1;

public class CastingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 123456780;
		int num2 = 123456780;
		
		//	자동형변환 int=> double
		//float : 부호 (1bit),지수(8비트)+가수(23비트)
		float num3 =num2;
		
		//double :부호 (1bit),지수(11비트)+가수(52비트)
		//double num3 =num2;
		System.out.println("num3 ="+num3);
		
		//강제형변환
		num2=(int) num3; //☆double=>int오류
		
		int result = num1-num2;
		System.out.println("result ="+result);
	}



}
