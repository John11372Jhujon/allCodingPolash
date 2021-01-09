package com.usa.alljava;

import java.util.Map;
import java.util.TreeMap;

public class CollectMapDemo {
	
	public static void main(String[] args) {
		
		
		//HashMap<Integer,String> mm = new HashMap<Integer, String>();
		//Hashtable<Integer,String> mm = new Hashtable<Integer, String>();
		TreeMap<Integer,String> mm = new TreeMap<Integer, String>();
		
		mm.put(1, null);// Hash map can  take one null value  
		mm.put(11, "sujan");
		mm.put(3, "sun");
		mm.put(1, "pal");
	
		System.out.println(mm);
		
		for( Map.Entry hh:mm.entrySet()) {
			System.out.println(hh.getKey()+"="+hh.getValue());
		}	
			
	}

	
		
		
	
}
