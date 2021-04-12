package practice10;

public class Div extends Calc {

	public Div(int a, int b) {
		this.a=a;
		this.b=b;

	}

	@Override
	int calculate() {
		
		return a/b;
	}

}
