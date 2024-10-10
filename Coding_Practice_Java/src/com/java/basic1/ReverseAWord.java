package com.java.basic1;

import java.util.Scanner;

public class ReverseAWord {
public static void main(String[] args) {
	String s1="hello each word ";
	//suing sb
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string you want to reverse : ");//check quizz prohect
	String sentence=sc.nextLine();
	
	StringBuilder sb1=new StringBuilder(s1);
	sb1.reverse();
	System.out.println(sb1);
	
	StringBuilder sb3=new StringBuilder(sentence);
	sb3.reverse();
	System.out.println(sb3);
	
	StringBuffer sb2=new StringBuffer(sentence);
	sb2.reverse();
	System.out.println(sb2);
}
}
