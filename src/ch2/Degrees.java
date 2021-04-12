package ch2;

public class Degrees {
	public static void main(String[] args) {
		//화씨온도를 섭씨온도로 바꾸는 프로그램 작성
		//임의의 화씨온도를 변수로 선언하고 변경하시오.
		//섭씨온도=화씨온도-32*5/9
//		int Fahrenheit=30;
//		int Celsius= Fahrenheit-32*5/9;
//		System.out.println("섭시온도는 "+Celsius+"화씨온도는 "+Fahrenheit+"입니다." );
		int fahr =54;
		double celsius=(double)(fahr-32)*5/9;
		System.out.println("섭씨온도 : "+celsius);
	}
}
