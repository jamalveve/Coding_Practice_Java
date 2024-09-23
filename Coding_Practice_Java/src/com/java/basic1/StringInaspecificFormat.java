package com.java.basic1;

import java.util.Scanner;

public class StringInaspecificFormat {
public static void main(String[] args) {
    System.out.println("\nTwinkle, twinkle, little star, \n\tHow I wonder what you are! \n\t\tUp above the world so high, \n\t\tLike a diamond in the sky. \nTwinkle, twinkle, little star, \n\tHow I wonder what you are!\n\n");
// /n ->next line
//    /t->space for text
    
    int n;
    char s1, s2, s3;
    Scanner in = new Scanner(System.in);
    
    // Prompt the user to input a number.
    System.out.print("Input number: ");
    n = in.nextInt();
    
    // Display the number in a specific pattern.
    System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
    System.out.printf("%d/%d",n,n);

}
}
