package com.java.basic1;

import java.util.Scanner;

//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. 
public class Example3 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first Number : ");
	int firstNumber=sc.nextInt();
	System.out.println("Enter Second Number : ");
	int SecondNumber=sc.nextInt();
	
	Example3 objnew=new Example3();
	objnew.Calculator(firstNumber, SecondNumber);
	
	
}
public void Calculator(int firsttNumber,int SecondNumner) {
	System.out.println(firsttNumber+SecondNumner);
	System.out.println(firsttNumber*SecondNumner);
	System.out.println(firsttNumber/SecondNumner);
	System.out.println(firsttNumber%SecondNumner);
//	System.out.println(firsttNumber+SecondNumner);
//	System.out.println(firsttNumber+SecondNumner);

	
}
}
