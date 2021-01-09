package com.practicedemo;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class Treecollection {

	public static void main(String[] args) {
		
		Treecollection.alist(); //Call the method
		System.out.println(); //For Space in console
		TreeMap<Integer,String> qq=new TreeMap<Integer,String>();
		
		qq.put(3, "Dell,15");
		qq.put(1, "Apple iMac");
		qq.put(2, "HP");
		qq.put(7, "Asus");
		qq.put(6, "Lenovo Laptop");
		qq.put(5, "Toshiba");
		
		System.out.println(qq);
		
		System.out.println();
		System.out.println("++++++++++");
		System.out.println();
		
		for( Map.Entry mm:qq.entrySet()) {
			System.out.println(mm.getKey()+"="+mm.getValue());	
			
		}
		
	}
   public static void alist() {
	   
	   LinkedList<String> obj=new LinkedList<String>();
	   
	   obj.add("John Shujon");
	   obj.add("Shahid Ullah");
	   obj.add("Miss Colombia");
	   obj.add("Boeing 737Max");
	   obj.add("Air Bus A320");
	   
	   System.out.println(" "+obj);
	   
	   
	   
	   
	   Iterator<String> ss=obj.iterator();
	   while(ss.hasNext()){
		  System.out.println(ss.hasNext()); // its going infinite time
	   }
   }
}
