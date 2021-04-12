package practice10;

public class Add extends Calc {

	public Add(int a, int b) {
		this.a=a;
		this.b=b;

	}

	@Override
	int calculate() {
		
		return a+b;
	}

}
