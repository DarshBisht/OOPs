/*Polymorphism:- Poly means many, Morphism means forms = which has may form is called 
 *Polymorphim like water:- water is a liquid, solid, gas or shapes- rectangle, square, circle  or sound- bark, roar etc.
 *
 *Types:- 1) Compile time Poly.(Static polymorphism)- Method overloading(achieve) it is handled by compiler
 *		  2) Run time Poly.(Dynamic polymorphism)- Method overriding(achieve) it is handled by JVM
 *
 *Method overloading- 1)Same method name 2)Same class 3) Different arguments- no. of args or seq. of args or type of args satisfy any one of them.
 *Method overriding- 1) Same method name 2)Different class 3) Same arguments- no. of args or seq. of args or type of args satisfy any one of them. 4) Inheritance concept should be here.
 *
 *Ques: Can we achieve method overloading by changing the return type of method only
 *Ans- no compiler will get confused due to ambiguity error if you have passed different parameter then it will not give error.
 *
 *METHOD OVERRIDING case 1: Auto promotion in java  char 'a' can convert into int 
 *
 *Case 2: Object is a parent class of all the classes in java Note:- if there are a parent object method and child string method and
 *calling the string method so it will call the string class it's 1st preference will go to child class
 *
 *Case 3: StringBuffer and String both are child class of Object parent class
 *
 *Case 4: int  to float auto promotion eg- if there are 2 methods and no. of args same and trying to auto promote it will not work
 *you need you pass only 1 int variable to work the method eg- p.show("ABC",10)
 *
 *Case 5: var args: The var args allows the method to accept zero or multiple args
 *
 *
 *METHOD OVERRIDING Case 1: Do overriding method must have same return type(or sub-type)
 *Ans- Before 1.4 version return type must be same but from 5.0 version we can use co-variant return type method eg- if there are parent class
 *and child class so in the child we can change the return type like parent class return type is Object so child class return type
 *can be same return type and Object and it's less type as String, StringBuffer, StringBuilder, Character, Boolean,
 *void and Number and it's primitive data types like byte, short, int, long, float, double etc 
 *
 *Case 2: Overriding and Access modifier
 *ans- The access modifier for an overriding method can allow same or more, but not less,
 *access than the overridden method. eg- a protected instance method in the super class
 *can be made public, but not default and private , in the sub class. Doing so, will generate compile time error.
 *
 *Case 3: Overriding and Exception handling:- there are two rules for it
 *1) If the super-class overridden method does not throw an exception, subclass overridden
 *method can only throw the unchecked exception , throwing checked exception will lead to compile time error.
 *2) If the super-class overridden method does throw the exception, subclass overridden method
 *can only throw same, subclass exception. Throwing parent exception in Exception hierarchy
 *will lead to compile time error. Also there is no issue if subclass overridden  method
 *is not throwing any exception.
 *
 *Case 4: Overriding and Abstract method- In Abstract class abstract method can be written which has no body {}  it's not allowed
 *eg- abstract void show(); this is allowed only and it is necessary to override the method in subclass always and same with 
 *Interface concept- in interface by default there are abstract method is used,  
 *In case an abstract method is inside the interface so it is also necessary to override the method in subclass 
 *Note- Abstract method is an interface or abstract class are meant to be overridden
 *in derived concrete classes otherwise compile-time error will be thrown
 *
 *Case 5: How to invoke Overridden(abstract parent class method) method from subclass?
 *Ans- We can call parent class method in overriding method using super keyword.
 *
 *Case 6: Which method can not override?
 *Ans-  1) Final method can not be overridden:- If we don't want a method to be overridden, 
 *			we declare it as final.
 *		2) Static method can not be overridden:- (Method Overriding vs Method Hiding) When
 *			you define a static method with same signature(same method name and parameters)
 * 			as a static method in base class it is known as method hiding.
 *		3) Private method can not be overridden:- Private method can not be overridden as 
 *			they are bounded during compile time. Therefore we can not even override private
 *			method in a subclass
 *
 *Case 7: Can we override synchronized/strictfp method
 *Ans- Yes, The presence of synchronized/strictfp modifier with method have not effect on the
 *		rules of overriding, i.e. it's possible that a synchronized/strictfp method can
 *		override a non synchronized/strictfp one and vica-versa */		

package com.java.oops;

// Method Overloading
public class Polymorphism_5 {
	
	public void show() {	// same method but it has different form 
		System.out.println("1");
	}
	private void show(int a) {	// it has different form like int a
		System.out.println("2");	
	}
	
	
	// Ques: Can we overload the main method ? ans- Yes
	public static void main(int b) {
		System.out.println("3");
	}
	
	// Case 2
	void show(Object a) {	// Parent method
		System.out.println("Object method");
	}
	void show(String a) {	// Child method
		System.out.println("String method");
	}
	// Case 3
	void show(StringBuffer a) {
		System.out.println("StringBuffer method");
	}
	// Case 4
	void show(int a, float b) {
		System.out.println("int float method");
	}
	void show(float a, int b) {
		System.out.println("float int method");
	}
	void show(String a, float b) {
		System.out.println("String float method");
	}
	// Case 5
	void show(int...a) {
		System.out.println("var args method");
	}
	public static void main(String[] args) {
		Polymorphism_5 p = new Polymorphism_5();
		p.show();
		p.show(10);	// show method is overloading.
		p.main(10);	// Overloading main method 
		p.show('a'); // Auto promotion
		p.show("ABC");// Calling String method
		p.show(new StringBuffer("ABC")); // Calling StringBuffer method
//		p.show(null); // In this case complier will get confused where to send null Sting class or StringBuffer class because both keeps same preference.
		p.show(10,10.2f);	// Calling int folat method
		p.show(20.5f,10);	// Calling folat int method
//		p.show(10,20);	// In this compiler will get confused because both methods has no. of args and whom it will auto promote.
		p.show("abc",10);	// Calling String float method.
		p.show(10,20,30,40); // calling var args if no args is passe it will also call the same but there should not be any empty method.
		
	}
}



// Method Overriding
class Test{
	void show(){
		System.out.println("1");
	}
}
class Xyz extends Test{
	void show() {	// Method overridden here by calling it's own method.
		System.out.println("2");
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.show();	// it will call parent class method only.
		Xyz x =  new Xyz();
		x.show();	// it is calling it's class method only because when we call method 1st it checks it's on class that is present or not then it checks to the other class if want to access the parent class directly then we use super keyword.
	}
};

// case 1
class Test1{
	Object show(){
		System.out.println("Parent class return type");
		return null;
	}
}
class Abc extends Test1{
	 String show() {	// Changing the return type in child class
		System.out.println("Child class return type sholud be same or less then parent class");
		return null;
	}
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.show();	
		Abc a =  new Abc();
		a.show();	
	}
};

// Case 2
class Test2{
	protected Object show(){	// Parent class access modifier can be default and less
		System.out.println("Super class");
		return null;
	}
}
class Abcd extends Test2{
	 public String show() {	//Child class access modifier can be more or same but not less
		System.out.println("Sub class access modifier can be same as parent or more not less");
		return null;
	}
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.show();	
		Abcd a =  new Abcd();
		a.show();	
	}
};

// Case 3
class Test3{
	protected Object show() throws RuntimeException {	//Rule 2: parent class exception can be higher level of exception in compare to child class exception and leave blank also but in this case child class can throw unchecked exception only.
		System.out.println("Super class Exception");
		return null;
	}
}
class Exc extends Test3{
	 public String show() throws ArithmeticException {	//Rule 1: If parent class does not throw the exception in subclass we can throw unchecked exception or same level parent class exception and it's child class exception and leave blank also but not checked exception like "throws Exception"
		System.out.println("Sub class Exception");
		return null;
	}
	public static void main(String[] args) {
		Test3 t = new Test3();
		t.show();	
		Exc m =  new Exc();
		m.show();	
	}
};

// Case 4
abstract class Test4{
	abstract protected Object show();	// Abstract method
}
class Abs extends Test4{
	 public String show() {	
		System.out.println("Child class abstract method overriding- use to hide sensitive functionality");
		return null;
	}
	public static void main(String[] args) {
//		Test4 t = new Test4();	// We can not create the object of abstract class
//		t.show();		// Not allowed
		Abs a =  new Abs();
		a.show();	
	}
};

// Case 4 using interface
interface I1 {	// In interface method access modifier- public, default, abstract, static and strictfp is allowed
	public Object show1();	// Abstract method 
}
abstract class Test5{
	abstract protected Object show();	// Abstract method
}
class Imp implements I1{
	 public String show1() {	// Access modifier is must in child class
		System.out.println("Child class abstract method overriding- use to hide sensitive functionality");
		return null;
	}
	public static void main(String[] args) {
//		Test5 t = new Test5();	// We can not create the object of interface
//		t.show1();		// Not allowed
		Imp i =  new Imp();
		i.show1();	
	}
};


// Case 5
class Test6{
	void show(){
		System.out.println("Calling parent class using super keyword");
	}
}
class Inv extends Test6{
	 void show() {	
		super.show();	// Calling the parent class method through super keyword.
		System.out.println("Child class");
	}
	public static void main(String[] args) {
		Inv i =  new Inv();
		i.show();	// Calling Inv class method
	}
};


// Case 6
class Test7{
	
//	final void show() {		// When method is final can not be overridden.
//	static void show() {	// When method is static it can not be overridden but if child class method is also static then it can be method hiding of parent class.
	private void show() {	// When method is private can not be overridden.
		System.out.println("Calling parent class");
	}
}
class Call extends Test7{
	 void show() {		// Can not override the method due to parent method is final or static but in case of static parent class method  if you also provide the static keyword in child class method then you can override the parent class otherwise it will hide the parent class if not declare the child class as static.
//		 super.show();	// Due to final, static and private method it's not going to work and and parent method is private show method is not visible.
		System.out.println("Callig child class");
	}
	public static void main(String[] args) {
		Test7 t = new Test7();
//		t.show();	// Can not call the private members of the class because private method are used in within class only by which can not override the parent class method.
		Call c =  new Call();
		c.show();	
	}
};

// Case 7

class Test8{
	public synchronized void show(){	// Synchronized or strictfp method can be overridden no issue occur in parent class or child class.
		System.out.println("parent class  ");
	}
}
class Acc extends Test8{
	 public strictfp void show() {		//strictfp or Synchronized method can be overridden no issue occur in child class or parent class.
		super.show();
		System.out.println("Child class");
	}
	public static void main(String[] args) {
		 Acc a =  new Acc();
		a .show();
	}
};
