package com.java.basic1;

import java.util.Scanner;

public class CaptializeFirstLetteroofString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
////		//
		System.out.print("Input a sentence: ");
		String sentence = in.nextLine();
//		 Initialize an empty string to store the result in uppercase
		String upper_case_line = "";
		// Create a Scanner to process individual words in the sentence
		Scanner wordScan = new Scanner(sentence);

		// Iterate through the words in the sentence
		while (wordScan.hasNext()) {
			String word = wordScan.next();

			upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";

		}
		System.out.println(upper_case_line.trim());
		
		
//		/way 2
//		String sentence = "this is a sample sentence.";

//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("Enter a sentence: ");
//		String sentence = scanner.nextLine(); // Read the user input
//		String capitalizedSentence = capitalizeFirstLetterOfEachWord(sentence);
//		System.out.println(capitalizedSentence);
//
//		scanner.close(); // Close th
	}

//	public static String capitalizeFirstLetterOfEachWord(String sentence) {
//		String[] words = sentence.split(" "); // Split the sentence into words
//		StringBuilder capitalizedSentence = new StringBuilder();
//
//		for (String word : words) {
//			if (word.length() > 0) {
//				// Capitalize the first letter and add the rest of the word
//				String capitalizedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1);
//				capitalizedSentence.append(capitalizedWord).append(" "); // Append to the result
//			}
//		}
//
//		return capitalizedSentence.toString().trim(); // Remove trailing space
//	}
}
