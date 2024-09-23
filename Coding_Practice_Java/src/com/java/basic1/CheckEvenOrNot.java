package com.java.basic1;

import java.util.Scanner;

public class CheckEvenOrNot {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter number: ");
		int InputNumber = sc1.nextInt();
		CheckEvenOrNot obj = new CheckEvenOrNot();
		System.out.println(obj.CheckforOddEven(InputNumber));
	}

	public String CheckforOddEven(int numInput) {
		if (numInput % 2 != 0)
			return "number is odd";
		else
			return "number is even";
	}
}
