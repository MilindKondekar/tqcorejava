package com.treemap;



import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo3 {

	public static void main(String[] args) {
		
		 TreeMap<Integer,String> map1= new TreeMap<>();
	     // natural order.. asc of key
	            
			map1.put(7, "C");
			map1.put(6, "Python");
			map1.put(4, "Angular");
			map1.put(1, "Java");
			map1.put(8, null);
			map1.put(3, "SpringBoot");
			map1.put(2, "HTML");
			//map1.put(null, "Kotlin"); >> Exception
			
		// SortedMap	
		System.out.println("/////////////////////////////////");

		System.out.println("FirstKey:"+ map1.firstKey());
		System.out.println("LastKey:"+map1.lastKey());
		
		SortedMap<Integer, String> s1=map1.subMap(4, 7);// 4 is included.. 7 is excluded
		System.out.println(s1);
		
		SortedMap<Integer, String> s2=map1.headMap(4); // keys strictly less than 4
		System.out.println(s2);
		
		SortedMap<Integer, String> s3=map1.tailMap(4); // greater than equal to 4
		System.out.println(s3);
		
		// NavigableMap
		
		System.out.println("Lower Key:"+map1.lowerKey(4));// strictly less
		System.out.println("Floor Key:"+map1.floorKey(5));// less than or equal to
		System.out.println("Floor Key:"+map1.floorKey(4));
		
		System.out.println("Higher Key:"+map1.higherKey(4));// strictly greater than 
		System.out.println("Celing key:"+map1.ceilingKey(4));// greater than or equal to

		SortedMap<Integer, String> s5=map1.headMap(4, true); // 
		System.out.println(s5);
		
		SortedMap<Integer, String> s6=map1.tailMap(4, false); // 
		System.out.println(s6);
		
		SortedMap<Integer, String> s7=map1.subMap(4, true,7,true);
		System.out.println(s7);
		

	}

}
