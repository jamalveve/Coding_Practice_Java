package com.javaprogram.Hackerank;
import java.util.Scanner;

public class StaticBockExampleWthFlagVAlue {
	
	public class Solution {
	     static int B, H;
	    static boolean flag = true;
	static{
	    Scanner sc=new Scanner(System.in);
	    int H=sc.nextInt();
	        B=sc.nextInt();
	        if (B<= 0 || H<=0) {
	    flag = false;  
	    System.out.println("java.lang.Exception: Breadth and height must be positive");
	}
	    
	}

	public static void main(String[] args){
			if(flag){
				int area=B*H;
				System.out.print(area);
			}
			
		}//end of main

	}//end of class


}
