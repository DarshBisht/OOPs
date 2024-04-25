/*Abstraction:- Abstraction is hiding internal implementation & just highlighting the
 * setup services that we are offering 1) Abstraction is detail hiding (implementation hiding
 * 2) Data abstraction deals with exposing the interface to the user and hiding the details of implementation
 * 
 *  Ways/types to achieve abstraction:- 1) Abstraction class(0-100%)-achievement rate 2) Interfaces (100%)
 *  
 * Note below rules of abstraction:-
 *  1. A method without body (no implementation) is known abstract method.
 *  2. A method must always be declared in an abstract class, or we can say that if  a class
 *  has an abstract method, it should be declared abstract as well.
 *  3. If a regular class extends an abstract class, then the class must have to implement 
 *  all the abstract methods of abstract parent class or it has to be declared abstract as well.
 *  4. Abstract method in an abstract class are meant to be overridden in derived concrete
 *  class otherwise compile-time error will be thrown
 *  5. Abstract classes can not be instantiated, means we can't create an object of Abstract class.
 *  */
package com.java.oops;

public class AbstractionInJava_6 {};	// Not using this class. only for class name purpose.

// Abstraction class
abstract class Vehicle1{	// if a class is abstract so inside this class there could be abstract method and non abstract method also that is why it is 0-100% achievement of abstraction.
	
	int no_of_tyres;	// detail hiding in abstract class
	abstract void start();	// if in a class there is an abstract method so class must also be an abstract class. 
}

class Car1 extends Vehicle1{
	
	void start() {
		System.out.println("Car start with key");
	}
}

class Scooter extends Vehicle1{
	
	void start() {
		System.out.println("Scooter start with kick");
	}
	public static void main(String[] args) {
//		Vehicle1 v = new Vehicle1();	// Can not create the abstract class method which is not allowed because we don't want to give the accessibility of it. But we can create the reference of it. 
		Scooter s = new Scooter();
		s.start();
		Car1 c = new Car1();
		c.start();
	}
}