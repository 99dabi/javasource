package ch9;

public class AnimalEx {

	public static void main(String[] args) {
		//Animal animal = new Cat();
		//animal.sound();
		animalSound(new Cat());
		//animal = new Dog();
		//animal.sound();
		animalSound(new Dog());
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
