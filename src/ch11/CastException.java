package ch11;

public class CastException {
	public static void main(String[] args) {
		// java.lang.ClassCastException
		Dog dog= new Dog();
		change(dog);
		
		Cat cat = new Cat();
		change(cat);
	}
	public static void change(Animal animal) {
		//instanceof사용시 오류 사라진다.
		//Dog dog = (Dog)animal;
		if(animal instanceof Dog) {
			Dog dog =(Dog) animal;
		}
		
	}
}
