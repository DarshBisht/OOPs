/*There are 5 type of inheritance but in java there are below first 3 are applicable
 * 1) Single inheritance (one to one) A to B only	
 * 2) multilevel inheritance 	A to B & A to C & B to C inheritance
 * 3) Hierarchy inheritance  (one to many) A to B & C
 * 4) Multiple inheritance	(many to one) A B to C
 * 5) Hybrid inheritance (one to many and many to one) A to B & C, B & C to D */
package com.java.oops;

public class TypesOfInheritance_3 {

	public void showA() {
		System.out.println("A class method");
	}
}


// Single inheritance
class SubClass extends TypesOfInheritance_3 {

	void showB() {
		System.out.println("B class method");
	}

//	public static void main(String[] args) {
//		SubClass sc = new SubClass();
//		sc.showA();
//		sc.showB();
//	}
}


// Multilevel inheritance
class C extends SubClass {
	
	void showC() {
		System.out.println("C class method");
	}

//	public static void main(String[] args) {
//		C c = new C();	// To access all methods creating c class's object by SubClass object we can only access main class methods and it's own methods and with TypesOfInheritance object we can only access it's methods only 
//		c.showA();
//		c.showB();
//		c.showC();
//	}
}


// Hierarchy inheritance
class B1 extends TypesOfInheritance_3{
	void showB1() {
		System.out.println("I'm B1 class method");
	}
}
class C1 extends TypesOfInheritance_3{
	void showC2() {
		System.out.println("I'm C1 class method");
	}
	public static void main(String[] args) {
		C1 c1 = new C1();
		c1.showA();
//		c1.showB1();	// Can't access the B1 class method because in Hierarchy inheritance C1 can not access the B1 class and B1 class can not access the C1 class.
		c1.showC2();
	}
}