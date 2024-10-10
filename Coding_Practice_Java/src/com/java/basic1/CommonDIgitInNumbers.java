package com.java.basic1;

import java.util.Scanner;

public class CommonDIgitInNumbers {
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);

	// Prompt the user to input the first number
	System.out.print("Input the first number : ");
	int x = in.nextInt(); // Read and store the first number

	// Prompt the user to input the second number
	System.out.print("Input the second number: ");
	int y = in.nextInt(); // Read and store the second numver

	
	// Extract the last digit of each number
    int p = x % 10;
    int q = y % 10;

    // Remove the last digit from both numbers
    x /= 10;
    y /= 10;
    
    if(p==x||p==y||q==y||q==x||p==q) {
    	System.out.println(true);
    }
    else {
    	System.out.println(false);

    }

}
}
