package com.java.basic1;

//Write a Java program to print the sum of two numbers. 
public class SumofTwoNumbers {
	static int c = 4;
	static int d = 9;

	public static int addMethod(int value1, int value2) {
		return value1 + value2;

	}

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		System.out.println(a + b);
		System.out.println(d + c);
		SumofTwoNumbers obj = new SumofTwoNumbers();
		obj.method1();
		System.out.println(SumofTwoNumbers.addMethod(10, 50));

	}

	void method1() {
		System.out.println(c + d);

	}

}
