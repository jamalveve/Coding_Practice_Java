package com.java.basic1;

import java.util.Scanner;

public class MutilplicationTable {
	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the table number you want : ");
//	int tableNumber=sc.nextInt();
//	for( int i=1;i<=10;i++) {
//
//	 System.out.println(tableNumber + " x " + (i + 1) + " = " + (tableNumber * (i + 1)));
//	}
//	
//	//with method
//	MultiplicationTable(tableNumber);
//	
//}
//public static void MultiplicationTable(int number) {
//	for( int i=1;i<=10;i++) {
//		System.out.println(i+"*"+number+"="+number*i);
//	}
	
	
	//EOF
	
//	Scanner sc=new Scanner(System.in);
    StringBuilder str=new StringBuilder();
      int count=0;
      while(sc.hasNext()){
          count++;
          str.append(count+" "+sc.nextLine()+" "+"\n");
      }
      System.out.println(str);
}
}
