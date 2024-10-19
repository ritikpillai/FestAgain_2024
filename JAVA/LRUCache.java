package com.festagain;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

//Designing a data structure that follows the constraints of a Least Recently Used (LRU) cache. 



//LRUCache class: 



//LRUCache(int capacity) Initialize the LRU cache with positive size capacity. 

//int get(int key) Return the value of the key if the key exists, otherwise return -1. 

//void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key. 

//The functions get and put must each run in O(1) average time complexity. 




//Example 1: 



//Input 

//["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"] 

//[[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]] 

//Output 

//[null, null, null, 1, null, -1, null, -1, 3, 4] 







public class LRUCache {

	 private Integer capacity;
	 private LinkedHashMap<Integer, Integer> LRU;
	 
	 public LRUCache(Integer capacity){
	     this.capacity = capacity;
	     LRU = new LinkedHashMap<>();
	 }
	
	 public Integer get(Integer key){
	     if(! isKeyPresent(key) ) return -1;
	     Integer value = LRU.get(key);
	     updateLru(key, value, key);
	     return value;
	 }
	
	 public void put(Integer key, Integer value){
	     if(LRU.size() == capacity){
	         Entry<Integer, Integer> firstEntry = LRU.entrySet().iterator().next();
	         updateLru(firstEntry.getKey(), value, key);
	     }
	     updateLru(key, value, key);
	     for(Entry<Integer, Integer> entry: LRU.entrySet()) {
	     System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
	     }
	     System.out.println();
	 }
	
	 public boolean isKeyPresent(Integer key){
	     return LRU.containsKey(key);
	 }
	
	 public void updateLru(Integer removingkey, Integer updatingValue, Integer insertingKey){
		 if( isKeyPresent(removingkey) ) LRU.remove(removingkey);
	     LRU.put(insertingKey, updatingValue);
	 }
	 
	 public static void main(String[] args) {
		 
		LRUCache lRUCache = new LRUCache(2); 

		lRUCache.put(1, 1); // cache is {1=1} 

		lRUCache.put(2, 2); // cache is {1=1, 2=2} 

		System.out.println(lRUCache.get(1)); // return 1 

		lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3} 

		System.out.println(lRUCache.get(2)); // returns -1 (not found) 

		lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {3=3, 4=4} 

		System.out.println(lRUCache.get(1)); // return -1 (not found) 

		System.out.println(lRUCache.get(3)); // return 3 

		System.out.println(lRUCache.get(4)); // return 4 
		 
	 }
 


}