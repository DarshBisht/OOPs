package com.java.oops;

public class CallByReferenceMethod_1 { // Way of initializing object

	String color;
	int age;

	private void obj1(String a, int b) {
		color = a; // passing the object's parameters value into the instance/global variable.
		age = b;
	};

	private void display() {
		System.out.println("Buzo color and age is: " + color + "," + age);
	};
	private void display1() {
		System.out.println("Tommy color and age is: " + color + "," + age);
	};

	public static void main(String[] args) {

		CallByReferenceMethod_1 buzo = new CallByReferenceMethod_1();
		buzo.obj1("black", 10); // Initializing object through method
		buzo.display();
		CallByReferenceMethod_1 tommy = new CallByReferenceMethod_1();
		tommy.obj1("white",7);
		tommy.display1();
	}
};
