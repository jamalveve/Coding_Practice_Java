package com.java.basic1;

import java.lang.reflect.Array;
import java.util.Scanner;

//Write a Java program that takes three numbers as input to calculate and print the average of the numbers. 
public class Example7 {
	public static void main(String[] args) {
//	int count=0;

//		Scanner sc1 = new Scanner(System.in);
//	System.out.println("print first input:");
//	int value1=sc1.nextInt();
//	System.out.println("print Second input:");
//	int value2=sc1.nextInt();
//	System.out.println("print third input:");
//	int value3=sc1.nextInt();
//	methodForcalculatingAverage(value1, value2, value3);
		methodForcalculatingAverage();

	}

//	public static void methodForcalculatingAverage(int val1, int val2, int val3) {
	public static void methodForcalculatingAverage() {

//		System.out.println((val1 + val2 + val3) / 3);

		System.out.println("Enter the number of elememnts:");
		Scanner sc1 = new Scanner(System.in);

		int numberofElememnts = sc1.nextInt();
		double sumofAlltheNumbers = 0;
		int[] arrayOfNumbers = new int[numberofElememnts];
		for (int i = 0; i < numberofElememnts; i++) {
			arrayOfNumbers[i] = sc1.nextInt();
			sumofAlltheNumbers = sumofAlltheNumbers + arrayOfNumbers[i];

		}
		double average = sumofAlltheNumbers / numberofElememnts;
		System.out.println(average);
	}
}
