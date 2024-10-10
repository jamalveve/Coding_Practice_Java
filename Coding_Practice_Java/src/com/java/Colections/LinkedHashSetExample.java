package com.java.Colections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<String> setofStrings = new LinkedHashSet<>();
		setofStrings.add("HELLO");
		setofStrings.add("HLO");
		setofStrings.add("ABC");
		setofStrings.add("FGH");

		System.out.println(setofStrings);
//	Iterator it = setofStrings.descendingIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

//	descendingIterator() is available in NavigableSet (e.g., TreeSet).

//	TreeSet<String> valuesofTreeSEt=new TreeSet<>();

	}
}
