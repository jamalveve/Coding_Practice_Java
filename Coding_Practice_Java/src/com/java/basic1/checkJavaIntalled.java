package com.java.basic1;

public class checkJavaIntalled {
	public static void main(String[] args) {
		System.out.println("\nJava Version: " + System.getProperty("java.version"));
//    Purpose: Displays the version of the Java Development Kit (JDK) currently in use (e.g., "17.0.2").

		System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
//    Purpose: Displays the specific version of the Java Runtime Environment (JRE) being used (might differ from the JDK version).

		System.out.println("Java Home: " + System.getProperty("java.home"));
//    Purpose: Displays the directory where Java is installed (e.g., the path to the JDK or JRE).
//
		System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
//    Purpose: Displays the name of the organization that provided the Java runtime (e.g., "Oracle Corporation").

		System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
//    Purpose: Displays the URL for the Java vendor, which typically links to the vendor's website.

		System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");
//    Purpose: Displays the classpath that the Java application is using, which is a list of locations where Java will look for classes and libraries.
	}
}
