package com.javaprogram.Hackerank;

import java.util.Scanner;

public class EnofOfFileExample {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the strings");
//	      StringBuilder str=new StringBuilder(); //syrigbuilder is better approach
	      String str1=new String();
	        int count=0;
	        while(sc.hasNext()){
	            count++;
//	            str.append(count+" "+sc.nextLine()+" "+"\n");
	            str1=str1+str1.concat(count+" "+sc.nextLine()+" "+"\n");
//	            String: Strings in Java are immutable, meaning every time you modify a string (like concatenating something to it), a new string object is created in memory. For example, if you concatenate two strings, the original string is not modified; instead, a new string is created and the old ones are discarded. This is inefficient if done multiple times.
	        }
//	        System.out.println(str);
	        System.out.println(str1);

	        
	        //pres cntrok+d to end the file
	}

}
