package com.java.basic1;

public class StringToInteger {
	public static void main(String[] args) {
		//upcastinf
//		String s1 = "jamal";//you cant do this
		String s1 = "123";//you can do this

//	int convertef=(int)s1;//you cant do this only for lowyer data type comverson (automatic)
		int result = Integer.parseInt(s1);// use wrraper class
		System.out.println("converted int: "+result);
		
		int number = 123;
		String str = String.valueOf(number);
		System.out.println("Converted string: " + str);
		
		// you cant do this only for lowyerdatatype (automatic)

		long value = 8908765432L;
		int value2 = (int) value;
		System.out.println(value2);

		double value3 = 8.90;
		float vlaue4 = (float) value3;
		System.out.println(vlaue4);

	}
}
