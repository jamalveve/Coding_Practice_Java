package com.java.basic1;

import java.util.Scanner;

public class CalculateTwoIntandEqualtoThird {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Input 1:");
		int value1 = sc1.nextInt();

		System.out.println("Enter the Input 2:");
		int value2 = sc1.nextInt();

		System.out.println("Enter the Input 3:");
		int value3 = sc1.nextInt();
		System.out.println(checkforEqual(value1, value2, value3));
	}

	private static boolean checkforEqual(int value1, int value2, int value3) {

		if (((value1 + value2) == value3) ||((value2 + value2) == value1)||((value3 + value1) == value2) ) {
			return true;
		} else
			return false;
	}
}
