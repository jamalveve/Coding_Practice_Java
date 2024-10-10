package com.java.basic1;

import java.util.Scanner;

public class SubstituteHashinStringifLessthat3 {
public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
	System.out.println("enter first string");
	String s1=sc1.nextLine();	

	
	String newString=" " ;
	if(s1.length()<3) {
		newString=s1+"###".substring(s1.length());
	}else {
		System.out.println(s1);
	}
	System.out.println(newString);
	
	 String result = createString(s1);
     System.out.println(result);
	

}
public static String createString(String str) {
    // If the string is shorter than 3 characters, pad with "#"
    return str.length() < 3 ? str + "###".substring(str.length())  : str;
    
//    str + "###".substring(str.length()) 
//    str:
//    	This is the original string input from which you want to create a new string.
//    	"###":
//    	This is a string literal containing three hash (#) characters.
//    	str.length():
//    	This method returns the length of the str. For example, if str is "ab", str.length() will return 2.
//    	"###".substring(str.length()):
//    	The substring method is called on the string "###".
//    	This method takes a starting index and returns the substring from that index to the end of the string.
//    If str.length() is 2, then "###".substring(2) will return the substring starting at index 2, which results in "#".
//    		If str.length() is 1, then "###".substring(1) will return "##".
//    		If str.length() is 0, then "###".substring(0) will return "###".
//
}

}
