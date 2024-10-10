package com.java.Colections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExamples {

	public static void main(String[] args) {

//		Write a Java program to append the specified element to the end of a linked list. 

		LinkedList<Integer> listofElements = new LinkedList<>();

		listofElements.add(6);
		listofElements.add(7);
		listofElements.add(10);
		listofElements.add(2);
		listofElements.add(4);
		listofElements.add(5);
		listofElements.add(9);

		System.out.println(listofElements);
		listofElements.addLast(100);
//		1. Write a Java program to append the specified element to the end of a linked list. 

		System.out.println(listofElements);

//		 Write a Java program to iterate through all elements in a linked list. 
		for (Integer nums : listofElements) {
			System.out.println(nums);
		}
//		Write a Java program to iterate through all elements in a linked list starting at the specified position.
		System.out.println(
				"//		Write a Java program to iterate through all elements in a linked list starting at the specified position.\n");
		Iterator iterator = listofElements.listIterator(3);
//		   Iterator iterator = listofElements.Iterator(3);//not possible

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

//		   Write a Java program to iterate a linked list in reverse order. 

		Collections.reverse(listofElements);
		System.out.println(listofElements);

		for (int i = listofElements.size() - 1; i >= 0; i--) {
			System.out.println(listofElements.get(i));
		}
//		   5. Write a Java program to insert the specified element at the specified position in the linked list. 

		listofElements.add(3, 6);
		System.out.println(listofElements);

		LinkedList<String> list = new LinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println("descening order");
		System.out.println("------------");

		Iterator<String> descIterator = list.descendingIterator();
		System.out.println("List in reverse order:");
		while (descIterator.hasNext()) {
			System.out.println(descIterator.next());
		}
		LinkedList<Integer> list5 = new LinkedList<>();
		list5.add(6);
		list5.add(10);
		list5.add(2);
		list5.add(3);

// Iterate through the list in reverse order

		Iterator<Integer> descIterator2 = list5.descendingIterator();

		// Iterate through the list in reverse order
		System.out.println("List in reverse order:");
		while (descIterator2.hasNext()) {
			System.out.println(descIterator2.next());
		}
		System.out.println("------------");

		ListIterator<Integer> its = listofElements.listIterator(listofElements.size());
		while (its.hasPrevious()) {
			System.out.println(its.previous());
		}

		Collections.reverseOrder();
		System.out.println(listofElements);
		Collections.sort(listofElements, Collections.reverseOrder());
		System.out.println(listofElements);

//			 Iterator iterator1 = listofElements.Iterator(3);//not posoble
////			   Iterator iterator = listofElements.Iterator(3);//not possible
//
//			   while(iterator.hasNext()) {
//				   System.out.println(iterator.next());
//			   }
//			
//			 Write a Java program to insert elements into the linked list at the first and last positions. 
		listofElements.addFirst(100);
		listofElements.addLast(100);

		System.out.println(listofElements);

//			Write a Java program to insert the specified element at the front of a linked list. 

		listofElements.offerFirst(500);
//			 Write a Java program to insert the specified element at the end of a linked list. 
		listofElements.offerLast(500);
//			Write a Java program to insert some elements at the specified position into a linked list. 
		listofElements.set(8, 1000);
		listofElements.set(1, null);

		System.out.println(listofElements);

//			Write a Java program to get the first and last occurrence of the specified elements in a linked list. 

		System.out.println(listofElements.getFirst());
		System.out.println(listofElements.getLast());

//			 Write a Java program to display elements and their positions in a linked list. 
//			
		for (int i = 0; i < listofElements.size(); i++) {
			System.out.println(listofElements.get(i));
		}

//		   12. Write a Java program to remove a specified element from a linked list. 

		listofElements.remove(5);
		System.out.println(listofElements);

//		   13. Write a Java program to remove the first and last elements from a linked list. 
		listofElements.removeFirst();
		listofElements.removeLast();
		System.out.println(listofElements);

//		   14. Write a Java program to remove all elements from a linked list. 
//		   listofElements.removeAll(listofElements);
//		   System.out.println(listofElements);

//		   15. Write a Java program that swaps two elements in a linked list. 
		Collections.swap(listofElements, 0, 7);
//		16. Write a Java program to shuffle elements in a linked list. 

		Collections.shuffle(listofElements);

		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("jam");
		list2.add("jamy");
		list2.add("jamu");
		list2.add("jamyy");
		list2.add("jamuu");
		list2.add("jamyyyyy");

		LinkedList<Object> list3 = new LinkedList<>();
		list3.addAll(list2);
		list3.addAll(listofElements);
		System.out.println(list3);

//		18. Write a Java program to copy a linked list to another linked list. 
		LinkedList<String> newClonedlist = (LinkedList<String>) list2.clone();

		System.out.println(newClonedlist);

		System.out.println(newClonedlist.removeFirst());
		System.out.println(newClonedlist);
//		19. Write a Java program to retrive and remove the first element of a linked list. 

		System.out.println("polfirst:");
		System.out.println(newClonedlist.pollFirst());
		System.out.println(newClonedlist);

//		19. Write a Java program to return and remove the first element of a linked list. 

//		Feature          	pollFirst()	                                               pop()
//		Collection Type  	Part of NavigableSet	                       ->Part of Deque
//		Return Value	    ->Returns the first element or null if empty	->Returns the first element or throws an exception if empty
//		Removal          ->	Removes the first element	                 ->Removes the first element
//		Behavior on Empty	->Returns null	                             ->Throws NoSuchElementException
		
		List<Integer> emotyuListRy=new LinkedList<>();
		System.out.println("check for poll and pop:");
		System.out.println(((LinkedList<Integer>) emotyuListRy).pollFirst());

		System.out.println(((LinkedList<Integer>) emotyuListRy).pop());// return
		System.out.println(emotyuListRy);// remove

//		Write a Java program to retrieve, but not remove, the first element of a linked list.

		System.out.println(newClonedlist.peekFirst());// return

		System.out.println(newClonedlist);// not removed

//		21. Write a Java program to retrieve, but not remove, the last element of a linked list. 

		System.out.println(newClonedlist.peekLast());// return

		System.out.println(newClonedlist);// not removed

//		 Write a Java program to check if a particular element exists in a linked list. 
		Iterator iterator3 = list2.iterator();
		while (iterator3.hasNext()) {
			Object value = iterator3.next();
			if (value.equals("jam")) {
				System.out.println("value found");
			} else {
				System.out.println("value not found");
			}

		}
		System.out.println("--------------------");

		if (list2.contains("hello")) {
			System.out.println("value found");
		} else {
			System.out.println("value not found");

		}

//		23. Write a Java program to convert a linked list to an array list. 
		ArrayList<String> convert = new ArrayList<String>(list2);
		System.out.println(convert);
		for (String str : list2) {
			System.out.println(str);
		}

//		26. Write a Java program to replace an element in a linked list. 
//		list2.replaceAll(null);//no null values accepted in linked list

//		list2.replace("jam","replaced");//no null values accepted in linked listl
		list2.set(1, "Orange");

		System.out.println(list2);

		Collections.replaceAll(list2, "Orange", "Grape");

		ListIterator<Integer> itsss = listofElements.listIterator(listofElements.size());
		while (itsss.hasPrevious()) {
			System.out.println(itsss.previous());
		}

//

//
	}

}
