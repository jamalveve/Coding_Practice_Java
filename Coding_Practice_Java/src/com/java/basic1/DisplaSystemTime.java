package com.java.basic1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class DisplaSystemTime {
	public static void main(String[] args) {
	    System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
	    System.out.format("Current Date time: %tc%n\n", System.currentTimeMillis());
	    System.out.format("\nCurrent Date time: %tc\n", System.currentTimeMillis());
	    System.out.format("Current Date time: %tc", System.currentTimeMillis());
//	    System.out.format("Current Date time: %tc");exception



//	    %tc: This is a format specifier that tells Java to format the provided argument (in this case, the current time) as a complete date and time.
//	    %n: This is another escape sequence that represents the platform-specific line separator (equivalent to \n but preferred for portability). It adds a newline after the output.
//	    Write a Java program to display the current date and time in a specific format. 
//	    Sample Output:
//	    Now: 2017/06/16 08:52:03.066 
		SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));

	    System.out.format("\nNow: "+cdt.format(System.currentTimeMillis()));//o/pNow: java.text.SimpleDateFormat@4ff3cbe5

	}

}
