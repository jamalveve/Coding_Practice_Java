package com.java.basic1;

import java.util.Scanner;

public class NoOfValueDivusbkeByNumbernInRange {
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);

		// Prompt the user to input the total seconds
//	    System.out.print("Input startRange: ");
//	    int startRange = in.nextInt();
//	    System.out.print("Input endRange: ");
//	    int endRange = in.nextInt();
//	    System.out.print("Input divisbleBy: ");
//	    int divisbleBy = in.nextInt();
//	    int count=0;
//	    
//	    for(int i=startRange;i<endRange;i++) {
//	    	if(i%divisbleBy==0) {
//	    		count++;
//	    	}
//	    }
//	   System.out.println(count); 

		Scanner in = new Scanner(System.in);
//
		int counts = 0;

		System.out.print("Input nuofELements: ");
		int noOfElements = in.nextInt();
		System.out.print("Input divisbleBy: ");
		int divisbleBys = in.nextInt();
		int arrayofELements[] = new int[noOfElements];
		for (int i = 0; i < noOfElements; i++) {
            System.out.print("Input element " + (i + 1) + ": ");

		     arrayofELements[i]=in.nextInt();
			if (arrayofELements[i] % divisbleBys == 0) {
				counts++;
			}
		}
		System.out.println(counts);
		
//		

		

	}
}
