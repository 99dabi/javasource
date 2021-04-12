package ch10;

public class MyAdder {
	public static void main(String[] args) {
		AdderInterface adder= new inputInterface();
		System.out.println(">> "+adder.add(3,5));
		System.out.println(">> "+adder.add(4));
	}
}
