package com.java.Colections;

import java.util.ArrayList;
import java.util.Spliterator;

public class CreateArrayList {

	public static void main(String[] args) {

		ArrayList<String> array_list=new ArrayList<>();
		array_list.add("green");
		array_list.add("Blue");
		array_list.add("Pink");
		array_list.add("white");
		array_list.add("peach");
		array_list.add("green");//duplicates allowed
		array_list.add(null);//null allowed
		//insertion order followed

		
		System.out.println(array_list);
		
		 Spliterator<String> spliterator = array_list.spliterator();
//
//	        // Using tryAdvance to process elements one by one
//	        System.out.println("Using tryAdvance:");
//	        spliterator.tryAdvance(System.out::println); // Prints A
//	        spliterator.tryAdvance(System.out::println); // Prints B
////splieteratpr
//	        
//	        // Reset Spliterator for demonstration
//	        spliterator = array_list.spliterator();
//	     // Using forEachRemaining to process remaining elements
//	        System.out.println("\nUsing forEachRemaining:");
//	        spliterator.forEachRemaining(System.out::println);
//	        
//	        spliterator = array_list.spliterator();

//	        System.out.println("\nSplitting the collection:");
//	        if (spliterator1 != null) {
//	            System.out.println("First half:");
//	            spliterator1.forEachRemaining(System.out::println);
//	        }
//
//	        System.out.println("Remaining half:");
//	        spliterator.forEachRemaining(System.out::println);
//	        
		 int splitIndex=5;
	        Spliterator<String> spliterator1 = spliterator.trySplit();

	        
	        Spliterator<String> leftSpliterator = splitAtIndex(spliterator, splitIndex);



	}
	private static Spliterator<String> splitAtIndex(Spliterator<String> spliterator, int index) {
        // Advance the spliterator to the desired index
        for (int i = 0; i < index && spliterator.tryAdvance(e -> {}); i++) {
            // Do nothing; just advancing
        	
        }

	}}
