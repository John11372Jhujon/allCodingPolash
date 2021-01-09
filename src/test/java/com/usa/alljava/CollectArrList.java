package com.usa.alljava;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectArrList {

	public static void main(String[] args) {
		
		//ArrList.count();
		
		System.out.println("+++++++++++++++++");
		
		ArrayList<Integer> xx=new ArrayList<Integer>();
		
		xx.add(6);
		xx.add(11);
		xx.add(15);
		xx.add(19);
		
		
		
		//System.out.println(xx);
		
		System.out.println("==============================");
		
		Iterator<Integer> ii=xx.iterator(); //While Loop
		while(ii.hasNext()) {
			System.out.println(ii.next());
				
		}
		
		for(int mm:xx) {
			System.out.println(mm);} //Enhance Loop

	}
  public static void count() {
	  
	  ArrayList<String> cc=new ArrayList<String>();
	  cc.add("Shujon");
	  cc.add("nazmul");
	  cc.add("Huda");
	 
	  
	  System.out.println(""+ cc);
	  
	  Iterator<String> zz=cc.iterator();
	  while(zz.hasNext()) {
		  
		  System.out.println(zz.hasNext());
		  
	  }
	  
	  
	  
  }
}
