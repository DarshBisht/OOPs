package com.java.oops;

import com.java.a_basic_java.Human;

public class ClassMethodAndObject_1 { // In a program there can be only one public class.

	public static void main(String[] args) {

		Animal_1 buzo = new Animal_1();
		buzo.bark(); // Calling it's behavior/method.
		buzo.color(); // Calling state/attribute.
		buzo.age(); // Calling state/attribute.
		Human ram = new Human(); // Calling method from different package by importing the package name
		ram.speak(); // Calling different method.
	}
};