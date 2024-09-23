package com.java.basic1;

import java.util.Scanner;

public class SwapEample {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the  numbers you want to swap: ");
	int swap1=sc.nextInt();
	int swap2=sc.nextInt();
	
	//using third variable
	int temp=swap1;
	swap1=swap2;
	swap2=temp;
	
	//without using third varaible
	
	
	System.out.println(swap1);
	System.out.println(swap2);

}
}
