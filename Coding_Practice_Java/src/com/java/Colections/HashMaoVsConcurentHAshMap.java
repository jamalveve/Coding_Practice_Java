package com.java.Colections;

import java.util.HashMap;
import java.util.Map;

public class HashMaoVsConcurentHAshMap {
public static void main(String[] args) {
    Map<String, Integer> hashMap = new HashMap<>();

    
    Runnable hasMapTask=()->{
    	 for (int i = 0; i < 100; i++) {
             hashMap.put(Thread.currentThread().getName() + "-" + i, i);
         }
    };
    Thread t1 = new Thread(hasMapTask);
    Thread t2 = new Thread(hasMapTask);

    t1.start();
    t2.start();
    
    System.out.println("HashMap size after concurrent access: " + hashMap.size());
    Runnable syncTask = () -> {
        synchronized (hashMap) {  // Explicit locking
            for (int i = 0; i < 100; i++) {
            	hashMap.put(Thread.currentThread().getName() + "-" + i, i);
            }
        }
    };

    Thread t3 = new Thread(syncTask);
    Thread t4 = new Thread(syncTask);

    t3.start();
    t4.start();
    System.out.println("HashMap size after synchronised access: " + hashMap.size());


}
}
