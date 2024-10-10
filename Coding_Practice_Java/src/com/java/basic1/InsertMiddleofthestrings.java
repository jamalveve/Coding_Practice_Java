package com.java.basic1;

//Write a Java program to insert a word in the middle of another string. 
//Insert "Tutorial" in the middle of "Python 3.0", so the result will be Python Tutorial 3.0.
//Sample Output:
public class InsertMiddleofthestrings {
	public static void main(String[] args) {
		String main_string = "Python 3.0";
		String word = "Tutorial";

		// Create a new string by concatenating substrings
		String result = main_string.substring(0, 7) + word + main_string.substring(6);
		System.out.println(result);
		// Print the resulting string
//    System.out.println(result);
		char[] ch = main_string.toCharArray();
		char[] resultChars = new char[ch.length + word.length()];

		for (int i = 0; i < ch.length; i++) {
			resultChars[i++] = ch[i];
		}
		// Insert the word
        for (int i = 0; i < word.length(); i++) {
            resultChars[i++] = word.charAt(i);
        }

        // Copy the rest of the main string
        for (int i = 6; i < ch.length; i++) {
            resultChars[i++] = ch[i];
        }

        // Convert the result char array back to a String
        String results= new String(resultChars);

        // Print the result
        System.out.println(result);
//	
        
        
        StringBuilder results1 = new StringBuilder();

        // Length where we want to insert the word
        int insertPosition = 7;

        // Traverse the original string
        for (int i = 0; i < main_string.length(); i++) {
            // Add character from main_string
            results1.append(main_string.charAt(i));

            // Insert the word at the specified position
            if (i == insertPosition) {
                results1.append(word);
            }
        }

        System.out.println(result.toString());

	}
}
