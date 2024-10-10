package com.java.Colections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<String> hassetofString = new HashSet<>();
		hassetofString.add("ho");
		hassetofString.add("hiloo");
		hassetofString.add("haiii");
		hassetofString.add("how");
		hassetofString.add("orange");
//		Write a Java program to append the specified element to the end of a hash set. 

		hassetofString.add("yuo");

//		2. Write a Java program to iterate through all elements in a hash list. 

		for (String str : hassetofString) {
			System.out.println(str);
		}
//       hassetofString.a

		Iterator itr = hassetofString.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

//		3. Write a Java program to get the number of elements in a hash set. 

		System.out.println(hassetofString.size());

//4. Write a Java program to empty an hash set. 

//		hassetofString.clear();
//		hassetofString.removeAll(hassetofString);
//		System.out.println(hassetofString);

//		Usage clear(): If you want to empty a collection, you would use clear().
//		Usage remove all(): Use this method when you want to remove specific elements that exist in another collection.

//		 Write a Java program to test if a hash set is empty or not. 

		if (hassetofString.isEmpty()) {
			System.out.println("empty");
		} else {
			System.out.println("not empty");
		}

//		Write a Java program to clone a hash set to another hash set. 

		HashSet<String> hashsetCloned = (HashSet<String>) hassetofString.clone();
		System.out.println(hashsetCloned);

		String[] new_array = new String[hashsetCloned.size()];

		hashsetCloned.toArray(new_array);// it womt become array only in this line
		System.out.println(new_array);// not possibke in array need to iterate

		for (String str : new_array) {
			System.out.println(str);
		}

//		8. Write a Java program to convert a hash set to a tree set. 
		TreeSet<String> treesetCovert = new TreeSet<>(hashsetCloned);

		System.out.println(treesetCovert);// asxending order we can see

//		10. Write a Java program to compare two hash set. 

		HashSet<String> hashset1 = new HashSet<>();
		hashsetCloned.add("banana");
		hashsetCloned.add("apple");
		hashsetCloned.add("orange");

		// Convert HashSet to a List
		List<String> list = new ArrayList<>(hashset1);

		// Sort the List
		Comparator<String> com = String::compareTo;
		Collections.sort(list, com);

		// Optionally, print the sorted list

		// Compare using equals()
		boolean areEqual = hashset1.equals(hassetofString);
		System.out.println("Are the two sets equal? " + areEqual); // Output: false

//	        11. Write a Java program to compare two sets and retain elements that are the same. 

//	        f you want to find common elements between two sets, you can use the retainAll() method:
		HashSet<String> set1 = new HashSet<>();
		set1.add("apple");
		set1.add("banana");

		HashSet<String> set2 = new HashSet<>();
		set2.add("banana");
		set2.add("cherry");

		// Find common element

		HashSet<String> commonElements = new HashSet<>(set1);
		commonElements.retainAll(set2);

		HashSet<String> commonElements2 = new HashSet<>(hassetofString);
		commonElements.retainAll(hashsetCloned);
////	        
		HashSet<String> commonElements3 = new HashSet<>(hashset1);
		commonElements.retainAll(hassetofString);
//////	        
		System.out.println("comon set1" + commonElements);
		System.out.println("comon set2" + commonElements2);
		System.out.println("comon set2" + commonElements3);

		HashSet<Integer> set5 = new HashSet<>();
		set5.add(10);
		set5.add(100);
		set5.add(50);
		set5.add(200);
		set5.add(3);
		set5.add(18);
		set5.add(500);

		Iterator it = set5.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		} // descending iterator no possible

//		9. Write a Java program to find numbers less than 7 in a tree set. 

	}

}
