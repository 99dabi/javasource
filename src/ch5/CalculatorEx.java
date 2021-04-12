package ch5;

public class CalculatorEx {
	public static void main(String[] args) {
		//객체 생성 => 기본 생성자가 호출
		Calculator cal = new Calculator();
		
		//메소드 호출
		cal.powerOn();
		
		//System.out.println(cal.plus(35, 45));
		int result=cal.plus(35, 45);		
		System.out.println(result);
		
		
		double result1=cal.divide(10, 4);
		System.out.println(result1);
	}
}




