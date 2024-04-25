/*There are two types of relationship between classes
 * 1) IS A Relationship (Inheritance)
 * - extends keyword is used
 * - blood relation b/w classes
 * - tightly coupled
 * 2) HAS A Relationship (Association):- 1) Aggregation "week relation" eg:- car and music player or college has a professor 2) Composition "strong relation" eg:- car and engine or college has a branches
 * - reference variable and new key is used
 * - non-blood relation b/w classes
 * - not tightly coupled
 * Advantages:- 1) code reusability 2) cost cutting, 3) reduce redundancy*/

package com.java.oops;

public class RelationshipInClasses_4 {};// Not using this class. only for class name purpose.


// Is a relationship (In this relationship we use extends key word)- Tightly coupled- If any changes made to the parent class auto effect will go to it's subclass which is not good.
class Vehicle{
	void a() {
	System.out.println("Vehicle class");	
	}
}
class Car extends Vehicle{	// Car is-a vehicle 
	void b() {
		System.out.println("Car class");
	}
//	public static void main(String[] args) {
//		Car c = new Car();
//		c.a();
//		c.b();
//	}
}

// Has a relationship - Not tightly coupled 
class Engine{
	void test() {
		System.out.println("Test method");
	}
}
class Car2{	// Car has a engine
	public static void main(String[] args) {
		Engine e = new Engine();	// With the help of object name we can access Engine class properties which is not tightly coupled 
		e.test();
	}
	
}