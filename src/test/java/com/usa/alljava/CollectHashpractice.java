package com.usa.alljava;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class CollectHashpractice {

	public static void main(String[] args) {

		HashMap<Integer, String> rr = new HashMap<Integer, String>();

		rr.put(1, "Apple");
		rr.put(2, "panasonic");
		rr.put(5, "Toyota");
		rr.put(4, "Honda");
		rr.put(6, "BMW");

		System.out.println(rr);

		System.out.println("================");

		// Important Looping:
		for (Map.Entry ff : rr.entrySet()) {
			System.out.println(ff.getKey() + "=" + ff.getValue());

			// System.out.println("++++++++++++++++++++++++++++");

			 //Hashpractice.table();
		}

	}

	private static void table() {

		Hashtable<Integer, String> ee = new Hashtable<Integer, String>();

		ee.put(3, "USA");
		ee.put(1, "Canada");
		ee.put(2, "Australia");
		ee.put(6, "New Zeland");
		ee.put(5, "Japan");
		ee.put(4, "England");

		System.out.println(ee);
		
		System.out.println(); //For gap in console
		System.out.println("&&&&&&&&");
		System.out.println(); // For gap in console 
		
for( Map.Entry ll:ee.entrySet()) {
	System.out.println(ll.getKey()+ "="+ ll.getValue());
	
}
}
		
	}


