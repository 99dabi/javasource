package practice10;

public class Mul extends Calc {

	public Mul(int a, int b) {
		this.a=a;
		this.b=b;

	}

	@Override
	int calculate() {
		
		return a*b;
	}

}
