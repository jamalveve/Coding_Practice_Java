package com.java.Colections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
//	1. Write a Java program to associate the specified value with the specified key in a Tree Map. 
		TreeMap<Integer, String> TreeMApvalues = new TreeMap<>();
		TreeMApvalues.put(1, "helo");
		TreeMApvalues.put(2, "helo000");
		TreeMApvalues.put(3, "helofine");
		TreeMApvalues.put(4, "helobaby");

		System.out.println(TreeMApvalues);

//	2. Write a Java program to copy Tree Map's content to another Tree Map. 
		TreeMap<Integer, String> TreeMApvaluesANother = new TreeMap<>();
		TreeMApvaluesANother.putAll(TreeMApvalues);
		System.out.println(TreeMApvaluesANother);

//	3. Write a Java program to search for a key in a Tree Map. 
		if (TreeMApvalues.containsKey(1)) {
			System.out.println("found the key " + TreeMApvalues.get(1));
		} else {
			System.out.println("not found");
		}

//	4. Write a Java program to search for a value in a Tree Map. 
		if (TreeMApvalues.containsValue("hai")) {
			System.out.println("found the value ");
		} else {
			System.out.println("not found");
		}

//	5. Write a Java program to get all keys from a Tree Map. 
		Set<Integer> ALlkeys = TreeMApvalues.keySet();
		for (Integer keys : ALlkeys) {
			System.out.println(keys);
		}

//	 6. Write a Java program to delete all elements from a Tree Map. 
//	 TreeMApvalues.clear();

//	 7. Write a Java program to sort keys in a Tree Map by using a comparator. 

		Comparator<String> comp = String::compareTo;
		TreeMap<String, String> tree_map1 = new TreeMap<String, String>(comp);
		// Put elements to the map
		tree_map1.put("C2", "Red");
		tree_map1.put("C4", "Green");
		tree_map1.put("C3", "Black");
		tree_map1.put("C1", "White");
		System.out.println(tree_map1);

		// but what if it is integer key
		Comparator<Integer> comp2 = Integer::compareTo; // Natural order comparator for Integer
//		TreeMap<Integer, String> TreeMApvalues2 = new TreeMap<>(comp2); 
//		or

		TreeMap<Integer, String> TreeMApvalues2 = new TreeMap<>(new SortKey());

		TreeMApvalues2.put(10, "jam");
		TreeMApvalues2.put(3, "kiii");
		TreeMApvalues2.put(9, "i am");
		TreeMApvalues2.put(4, "hello");
		System.out.println(TreeMApvalues2);

//		 7. Write a Java program to sort by values in a Tree Map by using a comparator. 
//		You can sort a TreeMap by values in Java using a Comparator by
//		first converting the TreeMap to a List of entries, 
//		sorting it, and then placing it back into a LinkedHashMap (since a TreeMap sorts by keys). 

//		 TreeMap inherently sorts only by keys, there is no built-in way to sort by values directly.so 
		// one way
		List<Map.Entry<Integer, String>> list = new ArrayList<>(TreeMApvalues2.entrySet());
		list.sort(Map.Entry.comparingByValue());
		LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<>();
		for (Map.Entry<Integer, String> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		System.out.println("TreeMap sorted by values: " + sortedMap);

//		 Write a Java program to get a  key-value mapping associated with the greatest key and the least key in a map. 
		// gretest
		System.out.println(TreeMApvalues.firstEntry());
		// least

		System.out.println(TreeMApvalues.lastEntry());

//		9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map. 

		System.out.println(TreeMApvalues.firstKey());

		System.out.println(TreeMApvalues.lastKey());

//		. Write a Java program to get a reverse order view of the keys contained in a given map. 

		TreeMap<Integer, String> TreeMApvalues3 = new TreeMap<>(Collections.reverseOrder());

		TreeMApvalues3.put(10, "jam");
		TreeMApvalues3.put(3, "kiii");
		TreeMApvalues3.put(9, "i am");
		TreeMApvalues3.put(4, "hello");
		System.out.println(TreeMApvalues3);

//		TreeMApvalues.putFirst(10,"iam first");
//		Write a Java program to get a reverse order view of the keys contained in a given map.

		System.out.println(" reverse order view of the keys: " + tree_map1.descendingKeySet());
		
		
		System.out.println(" reverse  insertion order view of the keys: " );

        TreeMap<Integer, String> descendingMap = (TreeMap<Integer, String>) TreeMApvalues3.descendingMap();//like descening iterator for list and set

        Iterator<Integer> it = descendingMap.keySet().iterator();
        while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

class SortKey implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
}
