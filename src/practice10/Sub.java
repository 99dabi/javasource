package practice10;

public class Sub extends Calc {

	public Sub(int a, int b) {
		this.a=a;
		this.b=b;

	}

	@Override
	int calculate() {
		
		return a-b;
	}

}
