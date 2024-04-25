/*Inheritance  inherit the properties of parent class into the child class 
 * like it's class members, method and variables etc.
 * In Inheritance there are two types of  relationship b/w classes 1) Is a and 2) Has a relationship between parent and child class.
 * Exception:- it does not inherit the constructor and private members and it is tightly coupled due to IS A relationship which use extends keyword. 
 * Benefits:- Code reusability, We can achieve polymorphism by allowing method overriding  */

package com.java.oops;

public class Inheritance_3 {

	void parent() {
		System.out.println("I'm parent class");
	}

	private void parent2() {	
		System.out.println("I'm parent 2 class");
	}
}
// Single inheritance
class ChildClass extends Inheritance_3 {

	void child() {
		System.out.println("I'm a child class");
	}

	public static void main(String[] args) {
		Inheritance_3 i = new Inheritance_3(); // Creating object of parent class through this i can call parent class method only.  
		i.parent();
//		i.child();	// Not allowed to call through parent calls object.
		ChildClass cc = new ChildClass();	// Creating object of child class through this i can call child class method too.
		cc.parent();
		cc.child();
	}
}
