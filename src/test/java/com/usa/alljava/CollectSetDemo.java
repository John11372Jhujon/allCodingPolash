package com.usa.alljava;

import java.util.Arrays;
import java.util.HashSet;

import java.util.List;
import java.util.TreeSet;

public class CollectSetDemo {
	
	public static void main(String[] args) {
		
		Integer a[]= {33,44,55,66,77,77,77};//no duplicate value allowed
		List<Integer> kk=Arrays.asList(a);
		HashSet<Integer> ss = new HashSet<Integer>(kk);
		
		System.out.println(ss);
		
		
		//HashSet<Integer> jj = new HashSet<Integer>();
		//LinkedHashSet<Integer> jj = new LinkedHashSet<Integer>();
		TreeSet<Integer> jj = new TreeSet<Integer>();
		jj.add(11);
		jj.add(12);
		jj.add(19);
		jj.add(9);
		System.out.println(jj);
		
		
	}

}
