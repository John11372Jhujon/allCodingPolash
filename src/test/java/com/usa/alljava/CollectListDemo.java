package com.usa.alljava;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectListDemo {
	
	public static void main(String[] args) {
		
		//Array List(Dynamic)
		
		ArrayList<Integer> aa = new ArrayList<Integer>();
		aa.add(99);
		aa.add(919);
		aa.add(929);
		aa.add(3, 88);// index adding
		aa.add(4,555);
		aa.remove(0);
		//aa.clear();
		System.out.println(aa);
		
		Iterator<Integer> ii=aa.iterator();  //Iterator loop
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}
		System.out.println("==============");
		
		for(int gg:aa) {//enhance loop 
			System.out.println(gg);
		}
		
		
	}

}
