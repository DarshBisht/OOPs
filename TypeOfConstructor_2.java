/*There 3 types of constructor in java 1) Default Constructor: No args constructor
 *  2) User defined Constructor: It can be No args or parameterized
 *  3) Parameterized Constructor
 *  */
package com.java.oops;

public class TypeOfConstructor_2 { /*
									 * When we create an object of a class and there is no constructor defined in
									 * the program so during the compile time it created automatically which is
									 * called default constructor.
									 */
	public TypeOfConstructor_2() {
		System.out.println("User defined Constructor");
	}

	public TypeOfConstructor_2(String name) {
		System.out.println("Paramerterized constructor");
	}

	public static void main(String[] args) {
		TypeOfConstructor_2 cons1 = new TypeOfConstructor_2();
		TypeOfConstructor_2 cons2 = new TypeOfConstructor_2("Darshan");

	}
};
