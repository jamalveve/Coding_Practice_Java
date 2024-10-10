package com.java.Colections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExamples {
	public static void main(String[] args) {
		HashMap<Integer, String> values = new HashMap<>();
		values.put(1, "helo");
		values.put(2, "helo000");
		values.put(3, "helofine");
		values.put(4, "helobaby");

		System.out.println(values);
//	2. Write a Java program to count the number of  key-value (size) mappings in a map.

		System.out.println(values.size());
//	3. Write a Java program to copy all mappings from the specified map to another map. 

		HashMap<Integer, String> values2 = new HashMap<>(values);
		System.out.println(values2);

		values.putAll(values2);
		System.out.println(values2);

//	4. Write a Java program to remove all mappings from a map. 
		values2.remove(values2);// wont owrk only works wth remove all here remove all dont supprot in hashmap
		values2.remove(3);// possible

		System.out.println(values2);

		values2.clear();// on optiob only

//		5. Write a Java program to get all keys from a Tree Map. 
		Set<Integer> ALlkeys = values.keySet();
		for (Integer keys : ALlkeys) {
			System.out.println(keys);
		}
//	Write a Java program to check whether a map contains key-value mappings (empty) or not. 

		System.out.println("is this map empty" + values.isEmpty());
		System.out.println("is this map empty" + values2.isEmpty());

//	6. Write a Java program to get a shallow copy of a HashMap instance. 

		HashMap<Integer, String> shallowCopy = (HashMap<Integer, String>) values.clone();

		System.out.println(shallowCopy);

//	7. Write a Java program to test if a map contains a mapping for the specified key. 

		if (values.containsKey(2)) {
			System.out.println("yes" + values.get(2));
		} else {
			System.out.println("no");
		}
		if (values.containsValue("helo")) {
			String key = values.get("helo");
			System.out.println("yes" + values.get(key));// ->theer is no way to find key so convert it to set and find
		} else {
			System.out.println("no");
		}

		System.out.println((values.containsKey("helo000") ? " yes" : "no"));

//		7. Write a Java program to test if a map contains a mapping for the specified value. 

		String targetValue = "helo";
		if (values.containsValue(targetValue)) {
			// Iterate through the map to find the key associated with the value
			for (Entry<Integer, String> entry : values.entrySet()) {
				if (entry.getValue().equals(targetValue)) {
					int key = entry.getKey();
					System.out.println("Yes, the key for value \"" + targetValue + "\" is: " + key);
					break;
				}
			}
		} else {
			System.out.println("No, the value \"" + targetValue + "\" does not exist.");
		}

//      9. Write a Java program to create a set view of the mappings contained in a map. 
		Set set = values.entrySet();
		System.out.println(set);

//      10. Write a Java program to get the value of a specified key in a map. 
		String val = (String) values.get(3);
		System.out.println(val);

		// Create a HashMap to store key-value pairs
		Map<String, String> map = new HashMap<>();

		// Adding some key-value pairs to the map
		map.put("name", "Alice");
		map.put("age", "25");
		map.put("25", "New York");

		// Prompting user for a key
//      Scanner scanner = new Scanner(System.in);
//      System.out.print("Enter the key to get its value: ");

		// Get the value for the specified key
		if (map.containsKey("name")) {
			String value = map.get("name");
			System.out.println("The value for key \"" + "name" + "\" is: " + value);
			System.out.println("yes" + values.get("25"));

		} else {
			System.out.println("Key \"" + "name" + "\" does not exist in the map.");
		}

		Map<Integer, Integer> map2 = new HashMap<>();

		// Adding some key-value pairs to the map
		map2.put(1, 10);
		map2.put(2, 25);
		map2.put(3, 45);

		if (values.containsKey(2)) {
			String value = values.get(2);
			System.out.println("The value for key \"" + 2 + "\" is: " + value);
			System.out.println("yes" + values.get(2));

		} else {
			System.out.println("Key \"" + 2 + "\" does not exist in the map.");
		}

//		Write a Java program to get a collection view of the values contained in this map.
		System.out.println("Collection view is: " + values.values());/// map.values();

	}
}
