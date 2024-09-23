package com.java.basic1;

import java.util.Scanner;

public class CompareTwoNumbers {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("first number: ");
		int numberOne = sc1.nextInt();

		System.out.println("Second number: ");
		int numberTwo = sc1.nextInt();
		CompareMethod(numberOne, numberTwo);

	}

	public static void CompareMethod(int num1, int num2) {
		if (num1 == num2) 
			System.out.printf("%d == %d\n", num1, num2);
		if (num1 != num2)
			System.out.printf("%d != %d\n", num1, num2);
		if (num1 < num2)
			System.out.printf("%d < %d\n", num1, num2);
		if (num1 > num2)
			System.out.printf("%d > %d\n", num1, num2);
		if (num1 <= num2)
			System.out.printf("%d <= %d\n", num1, num2);
		if (num1 >= num2)
			System.out.printf("%d >= %d\n", num1, num2);
	}
	
//	ystem.out.printf: This method allows you to print formatted output to the console. It uses format specifiers to determine how to format the output.
//	Format String: "%d == %d\n"
//		%d: This is a format specifier for integers. It tells the program to expect an integer value in that position.
//		==: This is a literal string that will be printed as is.
////		\n: This adds a new line after the output.
	
//	Arguments: num1 and num2 are the integer values that will replace the %d specifiers in the format string. The first %d will be replaced by the value of num1, and the second %d will be replaced by the value of num2.

}
