package com.java.basic1;

import java.util.Scanner;

public class NextToLastWordInSentence {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Input a sentence: ");
	String sentence = in.nextLine();
	  // Split the sentence into words using one or more spaces as the delimiter

	String[]words=sentence.split("[ ]+");
//	sample
//	String sentence = "Hello   world! This is  a test.";
//	String[] words = sentence.split("[ ]+");
//	The words array will contain:
//	["Hello", "world!", "This", "is", "a", "test."]
	
//	System.out.println(words.length-2);//it will print the length numnber
	System.out.println(words[words.length-2]);//it will print the word
	
//	System.out.println(words[words.length]);//it will throw exception AIOB
	System.out.println(words[0]);//it will print the word
	System.out.println(words[1]);//it will print the word
	System.out.println(words[2]);//it will print the word
	System.out.println(words[3]);//it will print the word


}
}
