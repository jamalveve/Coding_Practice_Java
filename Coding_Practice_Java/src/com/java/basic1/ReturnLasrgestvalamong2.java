package com.java.basic1;

import java.util.Scanner;

public class ReturnLasrgestvalamong2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// Prompt the user to input the first number
		System.out.print("Input the first number : ");
		int x = in.nextInt(); // Read and store the first number

		// Prompt the user to input the second number
		System.out.print("Input the second number: ");
		int y = in.nextInt(); // Read and store the second numver

//		if (x > y) {
//			System.out.println(x);
//		} else {
//			System.out.println(y);
//		}
//		
		
//		way 2//
//		System.out.println(result(x,y));
		//way 3
		System.out.println((x>y?x:y));//terminator operator

	}

	public static int result(int x, int y) {
		// Check if the two numbers are equal
		if (x == y) {
			return 0;
		}

//		// Check if the remainder when divided by 6 is the same for both numbers
//		if (x % 6 == y % 6) {
//			// If the remainder is the same, return the smaller number
//			return (x < y) ? x : y;
//		}

		// If the remainders are different, return the larger number
		return (x > y) ? x : y;
	}
}
