package com.java.Colections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class InsrertAtParticularIndex {
	public static void main(String[] args) {

		ArrayList<String> array_list1 = new ArrayList<>();
		array_list1.add("green");
		array_list1.add("Blue");
		array_list1.add("Pink");
		array_list1.add("white");
		array_list1.add("peach");
		array_list1.add("green");// duplicates allowed
		array_list1.add(null);// null allowed
		// insertion order followed

		System.out.println(array_list1);

		ArrayList<String> array_list = new ArrayList<>();
		array_list.add("green");
		array_list.add("Blue");
		array_list.add("Pink");
		array_list.add("white");
		array_list.add("peach");
		array_list.add("green");// duplicates allowed
//	array_list.add(null);//null allowed
		// insertion order followed

		// for loop
		for (int i = 0; i < array_list.size(); i++) {
			System.out.println(array_list.get(i));
		}

		// enchanced for loop
		for (String arr : array_list) {
			System.out.println(arr);
		}

		// while loop
		int i = 0;
		while (i < array_list.size()) {
			System.out.println(array_list.get(i));
			i++;// w/o i++ loop becomes infinite loop
		}

		// ietrator
		Iterator<String> iterator = array_list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// for each
		array_list.forEach(colors -> System.out.println(colors));
//		 Write a Java program to add an element (at a specified index) from a given array list. 

		array_list.add(2, "hello");
		System.out.println(array_list);
//	 Write a Java program to retrieve an element (at a specified index) from a given array list. 

		System.out.println(array_list.get(3));

//	5. Write a Java program to update an array element by the given element. 
		array_list.set(2, "helloUpadted");

		array_list.add(2, "helloadded");
		System.out.println(array_list);

//Write a Java program to remove the third element from an array list. 

		array_list.remove(3);
		System.out.println(array_list);

//	 Write a Java program to search for an element in an array list. 
		for (String str : array_list) {
			if (str.contains("green")) {
				System.out.println(str + " found");
			}
		}

//	 Write a Java program to sort a given array list. 
		Collections.sort(array_list);
		System.out.println(array_list);
		Collections.sort(array_list, Collections.reverseOrder());
		System.out.println("using sort revrese:");
		System.out.println(array_list);

		TreeSet<String> orderedset = new TreeSet<>(array_list);
//	orderedset.add("jam");
		System.out.println(orderedset);

		HashSet<String> noorderedhashset = new HashSet<>(array_list);
		System.out.println(noorderedhashset);

		// Write a Java program to shuffle elements in an array list.
		Collections.shuffle(array_list);
		System.out.println(array_list);

//	Write a Java program to reverse elements in an array list.
		Collections.reverse(array_list);
		System.out.println(array_list);

//	 Write a Java program to extract a portion of an array list. 
		System.out.println(array_list.subList(0, 3));
		List<String> subList = array_list.subList(0, 3);
		System.out.println(subList);

//		System.out.println(array_list);
		ArrayList<String> array_list2 = new ArrayList<>();
		array_list2.add("peach");
		array_list2.add("food");
		array_list2.add("snacks");
		array_list2.add("soru");
		array_list2.add("kolambu");
		array_list2.add("nonveg");
//		array_list.add("soruuu");
//		array_list.add("white");
//		array_list.add("peach");
//		array_list.add("green");
//
//		ArrayList<String> comparingList = new ArrayList<String>();
//		for (String elements : array_list)
//			comparingList.add(array_list2.contains(elements) ? "Yes" : "No");
//		System.out.println(comparingList);
//		
		System.out.println(array_list);
		System.out.println(array_list2);

//      Write a Java program to compare two array lists. 

		ArrayList<String> c1 = new ArrayList<String>(5);
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");

		ArrayList<String> c2 = new ArrayList<String>();
		c2.add("Red");
		c2.add("Green");
		c2.add("Black");
		c2.add("Pink");

		// Storing the comparison output in ArrayList<String>
		ArrayList<String> c3 = new ArrayList<String>();
		for (String e : c1)
			c3.add(c2.contains(e) ? "Yes" : "No");
		System.out.println(c3);

		System.out.println(array_list);

		Comparator<String> comparator = String::compareTo; // Natural order comparator
		Collections.sort(array_list, comparator);
		Collections.sort(array_list2, comparator);
		System.out.println(array_list);
		System.out.println(array_list2);

//       14. Write a Java program that swaps two elements in an array list. 
		Collections.swap(array_list2, 2, 4);
		System.out.println(array_list2);

		array_list.addAll(array_list2);
		System.out.println(array_list);

//		Write a Java program to clone an array list to another array list. 
		ArrayList<String> newClonedlist = (ArrayList<String>) array_list2.clone();

		System.out.println(newClonedlist);

//        17. Write a Java program to empty an array list. 
		array_list.clear();
		System.out.println(array_list);
		array_list2.removeAll(array_list2);
		System.out.println(array_list2);

//        Write a Java program to test whether an array list is empty or not. 
		System.out.println(array_list.isEmpty());

		System.out.println(array_list2.isEmpty());

		System.out.println(c3.isEmpty());

		if (array_list.isEmpty()) {
			array_list.addAll(c3);
		} else {
			System.out.println("not empty");
		}
		System.out.println(array_list);
		System.out.println(array_list.size());

//        	. Write a Java program for trimming the capacity of an array list. 
//        	Click me to see the solution
		array_list.trimToSize();// it will remove the extra size of the arrya loist array default capcaiuty 16

		System.out.println(array_list.size());

		c1.add("Red");

		c1.ensureCapacity(10);
		System.out.println(c1);

//		Write a Java program to replace the second element of an ArrayList with the specified element. 

		c1.set(2, "replaced");
		System.out.println(c1);

//		22. Write a Java program to print all the elements of an ArrayList using the elements' position. 
		System.out.println("\nOriginal array list: " + c1);
		System.out.println("\nPrint using index of an element: ");
		int no_of_elements = c1.size();
		for (int index = 0; index < no_of_elements; index++)
			System.out.println(c1.get(index));

		// reverse order

		ArrayList<Integer> c3s = new ArrayList<Integer>();
		c3s.add(10);
		c3s.add(1);
		c3s.add(10);
		c3s.add(6);
		c3s.add(8);
		c3s.add(10);
		c3s.add(10);
		System.out.println("hello descenibg");
		ListIterator<Integer> iterators = c3s.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Next Index: " + iterators.nextIndex());
			System.out.println("Element: " + iterators.next());
		}
		System.out.println("descending order");
//		
//		ListIterator<Integer> its = c3s.listIterator(c3s.size());
//		while (its.hasPrevious()) {
//			System.out.println(its.previousIndex());//if pnly infinite loop must folow with next line
//			System.out.println(its.previous());
//		}

//	Iterator<Integer> iter = c3s.Iterator(c3s.size());
//		while (iter.hasPrevious()) {
//			System.out.println(iter.previous());
//		}
//		  Iterator it = c3.descendingIterator();//not psossible

		// replace all method
		System.out.println("---------");
		Collections.replaceAll(c3s, 10, 100);
		Iterator it = c3s.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
