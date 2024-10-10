package com.java.Colections;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayListWays {
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
	
	//for loop
	for (int i = 0; i < array_list.size(); i++) {
	    System.out.println(array_list.get(i));
	}
	
	//enchanced for loop
	for(String arr:array_list) {
		System.out.println(arr);
	}
	
	//while loop
	int i=0;
	while(i<array_list.size()) {
		System.out.println(array_list.get(i));
		i++;//w/o i++ loop becomes infinite loop
	}
	
	//ietrator
	Iterator<String> iterator =array_list.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	//for each
	array_list.forEach(colors -> System.out.println(colors));

}
}
