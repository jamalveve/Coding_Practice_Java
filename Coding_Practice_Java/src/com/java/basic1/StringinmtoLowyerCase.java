package com.java.basic1;

import java.util.Scanner;

public class StringinmtoLowyerCase {
	public static void main(String[] args) {
		String s1 = "HELLO PEOPLE HI";
		String s2 = s1.toLowerCase();
		System.out.println(s2);

		String s3 = "HELLO PEOPLE HI";
		StringBuilder buildobj = new StringBuilder();

		for (char c : s3.toCharArray()) {
			buildobj.append(Character.toLowerCase(c));
		}
		System.out.println(buildobj);

		// from user
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = in.nextLine();
		String LOWYERFORSTletter=" ";
//		String newSentence=sentence.toLowerCase();
//		System.out.println(newSentence);
		
		Scanner wordscan=new Scanner(sentence);
		//ONLY FIRST LETTER
		
		while(wordscan.hasNext()) {
			String word=wordscan.next();
//			sentence+=Character.toLowerCase(word.charAt(0))+word.substring(1)+" ";
			LOWYERFORSTletter+=Character.toLowerCase(word.charAt(0))+word.substring(1)+" ";

		}
		System.out.println(LOWYERFORSTletter.trim());
		
	}
}
