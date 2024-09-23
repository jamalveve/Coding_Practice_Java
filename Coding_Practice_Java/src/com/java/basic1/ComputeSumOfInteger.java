package com.java.basic1;

import java.util.Scanner;

public class ComputeSumOfInteger {
public static void main(String[] args) {
	Scanner sc1 = new Scanner(System.in);
	System.out.println("enter number: ");
	int number = sc1.nextInt();
	
    
    // Calculate and display the sum of the digits
    System.out.println("The sum of the digits is: " + sumDigits(number));
}


public static int sumDigits(int n) {
    int sum = 0;
    
    // Calculate the sum of the digits
    while (n != 0) {  //The loop continues to execute as long as n is not zero. This ensures that the loop will process all digits of n.
        sum += n % 10; //n%10 ->Last Digit Extraction
        n /= 10;//The expression n /= 10 performs integer division, effectively removing the last digit from n. For example, if n is 123, after this operation, n becomes 12.
    }
    
    return sum;
}
}
