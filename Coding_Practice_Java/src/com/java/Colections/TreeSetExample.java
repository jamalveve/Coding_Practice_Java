package com.java.Colections;

import java.util.Iterator;

public class TreeSetExample {
public static void main(String[] args) {
    TreeSet<String> tree_set = new TreeSet<String>();
    tree_set.add("Red");
	  tree_set.add("Green");
	  tree_set.add("Orange");
	  tree_set.add("White");
	  tree_set.add("Black");
	  System.out.println("Tree set: ");
	  System.out.println(tree_set);

	  
	  
	  // Print the tree list
	  for (String element : tree_set) {
	    System.out.println(element);
	    }
	  
//	  3. Write a Java program to add all the elements of a specified tree set to another tree set. 
//	  tree_set1.addAll(tree_set2);
//	   System.out.println("Tree set1: "+tree_set1);
	 
//	   Write a Java program to create a reverse order view of the elements contained in a given tree set. 
	   
	   Iterator it = tree_set.descendingIterator();
	     // Print list elements in reverse order
	     System.out.println("Elements in Reverse Order:");
	     while (it.hasNext()) {
	        System.out.println(it.next());
	     }
	     
	     
//	     5. Write a Java program to get the first and last elements in a tree set. 
	     Object first_element = tree_set.first();
	     System.out.println("First Element is: "+first_element);
	  
	     // Find last element of the tree set
	     Object last_element = tree_set.last();
	     System.out.println("Last Element is: "+last_element);

//	     6. Write a Java program to clone a tree set list to another tree set. 
	     System.out.println("Original tree set:" + tree_set);  
	     TreeSet<String> new_t_set = (TreeSet<String>)tree_set.clone();
	           System.out.println("Cloned tree list: " + new_t_set);    
	           //get thenumber if elements
	           System.out.println("Size of the tree set: " + t_set.size());
	           
//	           8. Write a Java program to compare two tree sets. 
	           TreeSet<String> t_set1 = new TreeSet<String>();
	           // use add() method to add values in the tree set
	                t_set1.add("Red");
	                t_set1.add("Green");
	                t_set1.add("Black");
	                t_set1.add("White");
	                System.out.println("Free Tree set: "+t_set1);
	           TreeSet<String> t_set2 = new TreeSet<String>();
	           t_set2.add("Red");
	           t_set2.add("Pink");
	           t_set2.add("Black");
	           t_set2.add("Orange");
	           System.out.println("Second Tree set: "+t_set2);
	           
	           //comparison output in tree set
	           
	           TreeSet<String> result_set = new TreeSet<String>();
	          for (String element : t_set1){
	              System.out.println(t_set2.contains(element) ? "Yes" : "No");
	           }
	          //compsare using equal
	          boolean areEqual = t_set1.equals(t_set2);
		        System.out.println("Are the two sets equal? " + areEqual);  // Ou
		        
//		        9. Write a Java program to find numbers less than 7 in a tree set. 
		        
		        
		        TreeSet <Integer>tree_num = new TreeSet<Integer>();
		          
		        // Add numbers in the tree
		        tree_num.add(1);
		        tree_num.add(2);
		        tree_num.add(3);
		        tree_num.add(5);
		        tree_num.add(6);
		        tree_num.add(7);
		        tree_num.add(8);
		        tree_num.add(9);
		        tree_num.add(10);
		          
		        // Find numbers less than 7
		        TreeSet <Integer>treeheadset  = (TreeSet<Integer>)tree_num.headSet(7);//like how we clone  

		        // create an iterator
		        Iterator iterator;
		        iterator = treeheadset.iterator();
//		        /Displaying the tree set data
		        System.out.println("Tree set data: ");     
		        while (iterator.hasNext()){
		        System.out.println(iterator.next() + " ");
		        }
		        
//		        Write a Java program to get the element in a tree set which is greater than or equal to the given element. 
		        System.out.println("Greater than or equal to 86 : "+tree_num.ceiling(3));//it gives only greaterthat that
//		        Write a Java program to get the element in a tree set less than or equal to the given element. 
		        
		        System.out.println("Less than or equal to 29 : "+tree_num.floor(29));//it gives only lesser that that

//Write a Java program to get the element in a tree set strictly greater than or equal to the given element. 
		        System.out.println("Strictly greater than 76 : "+tree_num.higher(76));
		        System.out.println("Strictly greater than 31 : "+tree_num.higher(31));//it give the same value /grete than that
		        
		        System.out.println("Strictly less than 69 : "+tree_num.lower(69)); //it give the same value /leeser than that
		       //retirve and remove
		        System.out.println(tree_num.pollFirst());
		        
		        //returve but not remove->
		        peek first();
		        
		        

}
}
