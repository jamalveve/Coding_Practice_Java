package com.java.basic1;

import java.util.Scanner;

public class CountFactorsOfNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//
		System.out.print("Input the number: ");
		int number = in.nextInt();

		System.out.println(factor(number));
	}

	public static int factor(int n) {
		int count = 0;

		if (n == 1) {
			return 1;
		}
		count++;
		System.out.println(count);
		return n * factor(n - 1);

	}
}