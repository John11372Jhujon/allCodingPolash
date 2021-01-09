package com.usa.alljava;

public class Except1 {
	public static void main(String[] args) {

		String a = null;
		
		try {
			a.charAt(2);
		} 
		catch (StringIndexOutOfBoundsException obj) {
		System.out.println(obj.getClass());// for getting the exception name

		} 
		finally {  // Finally block must be execuated
			System.out.println("paa");
			System.out.println("hhhhh");
		}
		
		
	}

}
