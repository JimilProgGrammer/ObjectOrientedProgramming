package lab3;

/**
 * Class to demonstrate method overriding --> Dynamic Polymorphism
 * 
 * @author students
 *
 */
public class OverridingExample {
	public static void main(String[] args) throws Exception {
		System.out.println("-------------Observing behaviour of Animal class-------------");
		Animal animal = new Animal("Parent");
		animal.move();
		animal.eat();
		System.out.println("-------------Observing behaviour of Dog class-------------");
		Dog dog = new Dog("Tommy","Parent");
		dog.move();
		dog.eat();
		dog.bark();
		System.out.println("-------------Test Liskov's Principle of Substitution-------------");
		testLiskovPrinciple(animal);
		testLiskovPrinciple(dog);
		Dog d = new Dog();
		System.out.println("-------------Test Upcasting--------------------");
		Animal a = (Animal)d;
		//Calls the child methods even though parent reference is used
		a.eat();
		a.move();
		System.out.println("-------------Test Downcasting--------------------");
		//Explicitly downcasting --> When you want parent to perform functions of child
		((Dog)a).eat();
		((Dog)a).move();
		((Dog)a).bark();
	}
	public static void testLiskovPrinciple(Animal obj) {
		obj.move();
		obj.eat();
	}
}

class Animal {
	String data1;
	
	Animal() {
		System.out.println("Animal() called");
	}

	Animal(String name) {
		this.data1 = name;
	}

	public void move() {
		System.out.println("Animal " + data1 + " moves!");
	}

	public void eat() {
		System.out.println("Animal " + data1 + " eats!");
	}
}

class Dog extends Animal {
	String data2;
	
	Dog() {
		System.out.println("Dog() called");
	}
	
	Dog(String name, String parent) {
		super(parent);		
		this.data2 = name;
	}
	
	@Override
	public void move() {
		System.out.println("Dog " + data2 + " moves!");
	}
	
	@Override
	public void eat() {
		System.out.println("Dog " + data2 + " eats!");
	}
	
	public void bark() {
		System.out.println("Dog " + data2 + " barks!");
	}
}
