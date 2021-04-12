package ch1;
//강제 타입 변환 (Casting)

public class CastionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//작은 크기 타입 = (작은 크기 타입)큰 크기 타입
		int intValue =103029;//bit변환시=0000000000000001100111001110101
		byte byteValue = (byte)intValue;//오류
		System.out.println(byteValue);//byte에 남는값01110101
		//0000000000000001100111001110101
		
	}

}
