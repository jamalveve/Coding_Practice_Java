package com.java.varaible;


public class Example4 {
	int count2=0;
//	private
	static int count=0;////static variable can be modified inside any methods in the class level
	public void methods()
	{
		count++;
	}
	public Example4() {
		count2++;//but non static variable can be modifed only inside Constrcutor or non static method 
		count++;
	}
	public void nonStaticMethod() {
		count2++;//static varaibke can ve 
		count++;
	}
	
	public static void methodStatic() {
		count2++;//non static varaible cant be modified inside static methods
		count++;
	}
public static void main(String[] args) {
	
	int counts=0;
	counts=9;
	
	
	count=9;
	Example4 obj=new Example4();//1 for const
	
	obj.methods();
	obj.methods();
	obj.methods();
	obj.methods();//4 for methods in same class

	AnotherClass.methodStaticInAnotherClass();///one for this
	System.out.println(count);
	
	
}
}

 class AnotherClass {
	 public static void methodStaticInAnotherClass() {
		 Example4.count++;//if it is private static var you cant ouside the classs
	 }
 }
