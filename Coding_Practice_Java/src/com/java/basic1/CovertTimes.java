package com.java.basic1;

import java.util.Scanner;

//Write a Java program to convert seconds to hours, minutes and seconds. 
public class CovertTimes {
public static void main(String[] args) {
	// Create a Scanner object for user input
    Scanner in = new Scanner(System.in);

    // Prompt the user to input the total seconds
    System.out.print("Input seconds: ");
    int seconds = in.nextInt();

    // Calculate the hours, minutes, and seconds
    int S = seconds % 60;  // Calculate the remaining seconds
    System.out.println(S);
    int H = seconds / 60;  // Convert total seconds to minutes
    System.out.println(H);

    int M = H % 60;         // Calculate the remaining minutes
    System.out.println(M);

    H = H / 60;            // Convert total minutes to hours
    System.out.println(H);


    // Display the time in the format HH:MM:SS
    System.out.print(H + ":" + M + ":" + S);

    // Print a new line for better formatting
    System.out.print("\n");
}
}
