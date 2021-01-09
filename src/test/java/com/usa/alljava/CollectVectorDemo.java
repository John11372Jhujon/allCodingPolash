package com.usa.alljava;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class CollectVectorDemo {
	
	public static void main(String[] args) {
		
		Vector<Integer> vv = new Vector<Integer>(2,2);
		
		vv.add(99);
		vv.add(99);
		vv.add(99);
		vv.add(15);
		vv.add(33);
		
		System.out.println(vv);
		System.out.println("total capacity ="+vv.capacity());
		System.out.println("  ");
		 
		
		System.out.println("+++++++++++++++++++++");
		Iterator<Integer> ii=vv.iterator();
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}
		
		System.out.println("++++++++++++++");
		
		Enumeration<Integer> ee=vv.elements();
		while(ee.hasMoreElements()) {
			System.out.println(ee.nextElement());
		}
	}

}
