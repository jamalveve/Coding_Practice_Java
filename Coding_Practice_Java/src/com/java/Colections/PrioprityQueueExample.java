package com.java.Colections;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.PriorityQueue;

public class PrioprityQueueExample {
	public static void main(String[] args) {
		PriorityQueue<String> stringOfQueues = new PriorityQueue<>();
//	stringOfQueues.add(null);//no null//no order gauraentee
		stringOfQueues.add("hello");
		stringOfQueues.add("iam");
		stringOfQueues.add("fine");
		stringOfQueues.add("ayoo");

		System.out.println(stringOfQueues);

		for (String str : stringOfQueues) {
			System.out.println(str);
		}

//	 Write a Java program to add all the elements of a priority queue to another priority queue. 

		PriorityQueue<String> stringOfQueues2 = new PriorityQueue<>();
		stringOfQueues2.addAll(stringOfQueues);
		System.out.println(stringOfQueues2);

//	4. Write a Java program to insert a given element into a priority queue. 
		stringOfQueues.offer("hellooooo");
		System.out.println(stringOfQueues);

//	Write a Java program to remove all elements from a priority queue
//		stringOfQueues.removeAll(stringOfQueues);

//	6. Write a Java program to count the number of elements in a priority queue. 
		stringOfQueues.size();// ->print it

//7. Write a Java program to compare two priority queues. 
		boolean areEqual = stringOfQueues.equals(stringOfQueues2);
		System.out.println("Are the two sets equal? " + areEqual);

		// using for loop

		for (String elements : stringOfQueues) {
			System.out.println(stringOfQueues2.contains(elements) ? "yes" : "no");
		}

//	        check contains
		System.out.println(stringOfQueues.containsAll(stringOfQueues2));
		System.out.println(stringOfQueues);
//		Write a Java program to convert a priority queue to an array containing all its elements. 
		String[] newArray=new String[stringOfQueues.size()];
		stringOfQueues.toArray(newArray);
		for(String str:newArray) {
			System.out.println(str+" ");
		}
//		
		String  str;
		str=stringOfQueues.toString();
		System.out.println(str);
//		
        // Create a min-priority queue (default behavior)

		PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        minQueue.offer(5);
        minQueue.offer(1);
        minQueue.offer(3);
        minQueue.offer(4);
        minQueue.offer(2);
        
        // Convert to a max-priority queue using a custom comparator
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
        maxQueue.addAll(minQueue); // Add all elements from the minQueue

        // Print elements from the max-priority queue
        System.out.println("Max Priority Queue elements:");
        while (!maxQueue.isEmpty()) {
            System.out.print(maxQueue.poll() + " "); // Should print in descending order
        }
        
		
		
	}
}
