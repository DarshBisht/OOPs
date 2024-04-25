/*Encapsulation(Data security):- Encapsulation in java is a mechanism of wrapping the data(variables) and code
 * acting on the data (method) together as a single unit. eg:- Main medicine enclosed in capsule or Engine,break & gear system etc,  
 *are hided from driver 
 *
 *Steps to achieve encapsulation:-
 *1) Declare the variables of a class as private (Data hiding)	this is a sub part of encapsulation.
 *2) Provide public setter and getter methods to modify and view the variables values.*/

package com.java.oops;

public class EncapsulationInJava_8 {}; // Not for use this class only for class name file.



// Encapsulation
class Employee {

	private int empid; // Data hiding.

	// Getter
	public int getEmpId() {
		return empid;	// Use log file to check how many times it is retrieved.
	}

	// Setter
	public void setEmpId(int eid) {
		this.empid = eid;	// We can do further coding of log file to check is data modified by anyone or not.
	}
};

class Company {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpId(101); // Passing data to set method.
		System.out.println(e.getEmpId()); // Retrieving data from get method.
	}
};
