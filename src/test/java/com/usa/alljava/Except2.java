package com.usa.alljava;

public class Except2 {
	public static void main(String[] args) {

		int a[] = {3,4,5,6};
		
		try {
			System.out.println(a[5]);;
		} 
		catch (NullPointerException obj) {
		System.out.println(obj.getClass());// for getting the exception name

		} 
		finally {  // Finally block must be execuated
			System.out.println("paa");
			System.out.println("hhhhh");
		}
		
		System.out.println("sujon");
	}

}
