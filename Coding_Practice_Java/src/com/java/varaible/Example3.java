package com.java.varaible;

public class Example3 {

	int a;
	int b;
	
	void methodforInt(int a,int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Example3 newObj=new Example3();
		newObj.methodforInt(7, 9);
	}

}
