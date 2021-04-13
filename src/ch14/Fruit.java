package ch14;
//class 몰아 넣는것은 잘 하지 않음
public class Fruit {
	@Override
	public String toString() {
		return "Fruit";
	}
	
}
class Apple extends Fruit{
	@Override
	public String toString() {
		return "Apple";
	}
}
class Grape extends Fruit{
	@Override
	public String toString() {
		return "Grape";
	}
}
class Toy{
	@Override
	public String toString() {
		return "Toy";
	}
}
