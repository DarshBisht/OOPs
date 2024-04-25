/*--Class, Method and objects--*/
package com.java.oops;

public class Animal_1 { // In Animal class all object and method are presented.

	private void eat() { // method/behavior created of tommy object.
		System.out.println("Tommy is eating");
	};

	private void run() {
		System.out.println("Tommy is running");
	};
	
	public void bark() {
		System.out.println("Buzo is barking");
	}
	
	public void color() {
		System.out.println("Buzo is white and brown");
	}
	
	public void age() {
		System.out.println("Buzo age is 6 year old");
	}

	public static void main(String[] args) {

		Animal_1 tommy = new Animal_1(); // creation of an object of Animal class by new keyword.
		tommy.eat(); // tommy is an object calling eat method by dot eat function ".eat();",
		tommy.run();
		Bird sparrow = new Bird(); // to call another class create new object.
		sparrow.fly(); // Calling another class method.
		Creature_1 dragon = new Creature_1(); // created an object of creature class of package com.java.oops.
		dragon.fire(); // Calling the behavior/method of it.
	}
};

class Bird { // Another class created.
	public void fly() { // If not public can not be accessed
		System.out.println("Sp can fly");
	}
};
