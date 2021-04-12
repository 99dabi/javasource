package ch1;

public class CharVariable1 {
	/*
	Char 타입	(문자) =>''홑따옴표로 표현
		메모리 사용 2byte만 사용
		2byte = 16bit(0~2**16-1) 0~65,535 => 문자는 -가 없음
		문자 vs 문자열
		1개     2개이상
		''      "" 
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A';//문자
		//ascii code : 컴퓨터 키보드(숫자, 특수문자, 영어)에 있는 문자열을 숫자로 나타낸 값
		char ch2=65;// 대문자 A ascii코드★
		
		char ch3='a';
		char ch4=97;// 소문자 a ascii =97
		//char ch1='Ab';//오류발생 : 유효하지 않은 캐릭터 수
		String str="Ab";
		System.out.println("ch = "+ch+", ch2 = "+ch2);
		System.out.println("ch3 = "+ch3+", ch4 = "+ch4);
		System.out.println("str = "+ str);
		// + =>1. 연결의 의미
	}

}
