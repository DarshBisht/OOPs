/*There are two ways to achieve abstraction:- 1) Abstraction class 2) Interfaces
 * 
 * Interface:- Interfaces are similar to abstract class but having all the method of abstract type
 * 				before 8 version of java. And interfaces are the blueprint of the class.
 * 				It specify what a class must do and not how to do.  
 * 
 * Uses of interface and why it came in programming:-
 * 1) It is used to achieve abstraction.
 * 2) By interface, we can support the functionality of multiple inheritance (many to one).
 * 3) It is used to achieve loose coupling.
 * 		Loose coupling:- It is a design goal that seeks to reduce the inter-denpendencies
 * 						b/w components of a system with the goal of reducing the risk that
 * 						changes in one component will require changes in any other component.
 * 						Loose coupling is much more generic concept intended to increase the
 * 						flexibility of system, make it more maintainable and make the entire
 * 						framework more stable.
 * 
 * What comes inside the interfaces:- 1)By default:- "public abstract" methods comes and 
 * 									"public static final" constant fields(variables) comes.
 * 2) But after 8th version default concrete method also can be created which has body 
 * eg:- default void display(){}; and static concrete method also can be created which 
 * has public access modifier by default eg:- "public" static void display(){};.
 * 3) And in 9th version we can create private concrete method also.*/
package com.java.oops;

public class InterfaceInJava_7 {};	// Not for use this class only for class name file.


// Interface 1st
interface I2  {	// Interface is a blueprint of the class
	
	// constant field
	int a=5; 	// by default it is public static final field
	
	// abstract method
	void show();	// It is by default public abstract method

	// default concrete method
	default void display() {	 
		System.out.println("Default method is called");
	}

	// static concrete method
	static void display2() {	
		System.out.println("Static method is called");
	}
	
	// Private concrete method
//	private void display4() {	// java 9 version is not installed in my laptop.
//		System.out.println("Private method is called")
//	}
};


// Interface 2nd
interface I3 {
	
	void show2();
	
	static void display3() {
		System.out.println("Display3 static method is called");
	}
};

// Single inheritance
class Testing implements I2 {
	
	public void show() {	// Do not forget to pass the access modifier for it's visibility and subclass should contain the high or same level of access modifier.
		System.out.println("show method is overridden");
	}
	
	public void display() {
		System.out.println("Default method is overridden");
	}
	
	static void display2() {
		System.out.println("Static method is overridden");
	}
	
	public static void main(String[] args) {
//		I2 i = new I2();	// Creating interface object is not allowed.
		System.out.println(I2.a); 	// Calling interface class fields.
//		I2.display();	// Default method of interface class can not be called because it is not static.
		I2.display2();	// Calling interface class static method.

		Testing t = new Testing();	// Testing class object is created.
		t.show();		// Calling abstract show overridden method.
		t.display();	// Calling display overridden method. And if we do not override the default method then we can call interface call method directly. 
		Testing.display2();	// Calling display2 overridden method in static way.
	}
};

// Multiple inheritance 

class Testing2 implements I2,I3 {
	
	public void show() {
		System.out.println("show method is overridden in multiple inferitance");
	}
	public void show2() {
		System.out.println("show2 method is overridden in multiple inheritance");
	}
	
	static void display3() {
		System.out.println("display3 static method is overridden in multiple inheritance");
	}
	
	public static void main(String[] args) {
		Testing2 t1 = new Testing2();
		t1.show();
		t1.show2();
		Testing2.display3();
		
	}
};