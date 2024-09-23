package com.java.typeCasting;
//widening->casting lowyer data type to higher data type (automatic casting)
public class ExampleWideningCasting {
public static void main(String[] args) {
	int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);
    System.out.println(myDouble);
}
}
