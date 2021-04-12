package ch9;

public class Dog extends Animal{

	private void dog() {
		this.kind = "포유류";
	}
	@Override
	void sound() {
		System.out.println("멍멍");
	}
}
