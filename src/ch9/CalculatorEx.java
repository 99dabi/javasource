package ch9;

public class CalculatorEx {

	public static void main(String[] args) {
		Calculator adder = new Adder();
		adder.run();
		
		Calculator subtracter = new Subtracter();
		subtracter.run();
		//run을 호출 할 예정 
	}

}
