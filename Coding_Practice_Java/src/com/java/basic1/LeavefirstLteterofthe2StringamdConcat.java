package com.java.basic1;

import java.util.Scanner;

public class LeavefirstLteterofthe2StringamdConcat {
public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
	System.out.println("enter first string");
	String s1=sc1.nextLine();	
	System.out.println("enter second string");

	String s2=sc1.nextLine();
	
	String newString=s1.substring(1,s1.length())+s2.substring(1,s2.length());
	System.out.println(newString);

}
}
