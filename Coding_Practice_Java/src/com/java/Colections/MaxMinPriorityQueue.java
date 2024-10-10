package com.java.Colections;

import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Comparator;

public class MaxMinPriorityQueue {

	public static void main(String[] args) {

		// Minimum Priority Queue (default behavior)
		PriorityQueue<Integer> minPQ = new PriorityQueue<>();
		minPQ.add(10);
		minPQ.add(50);
		minPQ.add(30);
		minPQ.add(20);
		minPQ.add(40);

		System.out.println("Minimum Priority Queue:");
		while (!minPQ.isEmpty()) {
			System.out.println(minPQ.poll()); // Elements will be printed in ascending order
		}

//		 Maximum Priority Queue
		PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
		maxPQ.add(10);
		maxPQ.add(50);
		maxPQ.add(30);
		maxPQ.add(20);
		maxPQ.add(40);
//
		System.out.println("Maximum Priority Queue:");
		while (!maxPQ.isEmpty()) {
			System.out.println(maxPQ.poll()); // Elements will be printed in descending order
		}
//
//		// Alternate way using Comparator
		PriorityQueue<Integer> maxPQWithComparator = new PriorityQueue<>(Comparator.reverseOrder());
		maxPQWithComparator.add(15);
		maxPQWithComparator.add(25);
		maxPQWithComparator.add(35);

		System.out.println("Maximum Priority Queue (with Comparator):");
		while (!maxPQWithComparator.isEmpty()) {
			System.out.println(maxPQWithComparator.poll());
		}
	}
}
