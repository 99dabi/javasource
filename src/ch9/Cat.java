package ch9;

public class Cat extends Animal {

	private void cat() {
		this.kind = "포유류";
	}	
	@Override
	void sound() {
		System.out.println("야옹");
	}
}
