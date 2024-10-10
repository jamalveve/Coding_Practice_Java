package com.java.basic1;

import java.util.Scanner;

public class FindModuluswitotUsingModuloperator {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	// Prompt the user to input the first number
	System.out.print("Input the first number : ");
	int x = in.nextInt(); // Read and store the first number

	// Prompt the user to input the second number
	System.out.print("Input the second number: ");
	int y = in.nextInt(); // Read and store th
	
//	System.out.println(x%y);
	
	
	
	 int divided = x/ y;
//	 10/5=2
//	 5/3=1
//
     // Calculate the remainder of a divided by b
     int result = x - (divided * y);
//     ->(2*5)=> 10, 10-10=0
//     ->(1*3)=>3=> , 5-3=2
     
     System.out.println(result);

}
}
