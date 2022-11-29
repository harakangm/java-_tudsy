package test.ch07.추상클래스;

public class AbastractEx {

	public static void main(String[] args) {
	
		Dog dog = new Dog();
		dog.sound();
		dog.breathe();
		
		Cat cat = new Cat();
		cat.sound();
		
		//매개변수다형성
		animalSound(dog);
		animalSound(cat);
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
