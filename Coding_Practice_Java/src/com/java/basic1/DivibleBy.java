package com.java.basic1;

import java.util.Scanner;

public class DivibleBy {
	public static void main(String[] args) {

//	   obj.CheckDivisbkeBy3or5();
//usin array
		Scanner sc1 = new Scanner(System.in);
//		

		// Get the number of elements from the user
		System.out.println("Enter the number of elements: ");
		int inputNumberOfElements = sc1.nextInt();

		// Create an array of the specified size
		int[] arrayOfNumbers = new int[inputNumberOfElements];

		// Use a single for loop to take input and check divisibility
		System.out.println("Enter " + inputNumberOfElements + " numbers:");
		for (int i = 0; i < inputNumberOfElements; i++) {
			arrayOfNumbers[i] = sc1.nextInt();
			if (arrayOfNumbers[i] % 5 == 0) {
				System.out.println(arrayOfNumbers[i] + " is divisible by 5.");
			}
		}
		// Print numbers divisible by 5
//		System.out.println("Numbers divisible by 5:");
//		for (int number : arrayofNumbers) {
//			if (number % 5 == 0) {
//				System.out.println(number);
//			}
//		}
		/// wy 2
		System.out.println("Enter a number to find all divisible by 5 from 0 to that number: ");
		int upperLimit = sc1.nextInt();

		// Print all numbers divisible by 5 from 0 to upperLimit
		System.out.println("Numbers divisible by 5 from 0 to " + upperLimit + ":");
		for (int i = 0; i <= upperLimit; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}

		// wy 3.using start and end
		System.out.println("enter number from ");
		int startnumber = sc1.nextInt();
		System.out.println("enter number to: ");

		int endnumber = sc1.nextInt();
		DivibleBy obj = new DivibleBy();

//		using methid
		obj.CheckDivisbkeBy3and5(startnumber, endnumber);
		obj.CheckDivisbkeBy5(startnumber, endnumber);

		// wy 5

		int[] divisibleByFive = new int[upperLimit + 1];
		int index = 0;

	}

	}

	public void CheckDivisbkeBy3and5(int start, int end) {
		System.out.println("\nDivided by 3 and 5: ");

		for (int i = start; i < end; i++) {
			if (i % 3 == 0) {
				System.out.print(i + ", ");
			} else if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + ",");
			}
		}

	}

	public void CheckDivisbkeBy5(int start, int end) {
		System.out.println("\nDivided by 5: ");
		for (int i = start; i < end; i++) {
			if (i % 5 == 0)
				System.out.print(i + ", ");
		}

	}
}
