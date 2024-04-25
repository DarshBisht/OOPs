package com.java.oops;

public class CallByReferenceVariable_1 { // Way of initializing the object.
	String color;
	int age;
	
	public static void main(String[] args) {
		CallByReferenceVariable_1 buzo = new CallByReferenceVariable_1();
		CallByReferenceVariable_1 tommy = new CallByReferenceVariable_1();
		buzo.color = "red"; // Initializing object by passing value to class instance variables.
		buzo.age = 10;
		tommy.color = "black";
		tommy.age = 7;
		System.out.println("Buzo color and age is: " + buzo.color + " & " + buzo.age);
		System.out.println("Tommy color and age is: " + tommy.color + " & " + tommy.age);
	}
};
