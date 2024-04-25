/*Use of Constructor:- 1) To initialize an object 
 * 2) Easy to initialize object in one line 
 * 3) To make use of class instances like global variables 
 * if there are thousand of employee and we have store 
 * there data like names and id then we don't need to create 
 * multiple variables to them with the help of instance variable 
 * and by use of Constructor we only need to create one particular 
 * named variables eg:- String name, int emp_id; and then initialize object
 * though Constructor and store the multiple data into objects eg:- emp1 object
 * inside this name and emp_id is stored. 
 * 4) Time save less coding 5) 
*/
package com.java.oops;

public class Constructor_2 {

	String name;
	int emp_id;

	Constructor_2(String name, int id) {/* this is a Constructor:- Same name as class name and no return type even
		 								* void because it's main use to initialize the object with values not to 
		 								* return something and 2nd reason compiler also could not judge the return
		 								* type of the constructor when compiler creates the default constructor because
		 								* it could not decide what to return.
		 								*/
		this.name = name; // this keyword refers to the current class instances variables
		emp_id = id; /*	In this no need to use this keyword because of different named variables are
						 * there in case the parameterized variable name is same as instance variable
						 * name then it necessary to use this keyword because it refers to the instance
						 * variable in the class otherwise it'll get confused with same name and not
						 * pass the value to the instance variable because in a
						 * function/method/constructor or block of code it'll 1st check inside the
						 * constructor that the same named variable is present or not if present it will
						 * not check further and proceed.
						 */
		System.out.println(name + " " + emp_id);
	}

	public Constructor_2() {
		System.out.println(name + " " + emp_id);
	}

	public static void main(String[] args) {
		Constructor_2 emp1 = new Constructor_2("Deep",102); /* Constructor can be called directly no need to use . operator to access the
		 												* constructor we can use . operator to access the methods.
		 												*/
		Constructor_2 emp2 = new Constructor_2("Ram", 103);
		Constructor_2 emp3 = new Constructor_2();
	}
}
