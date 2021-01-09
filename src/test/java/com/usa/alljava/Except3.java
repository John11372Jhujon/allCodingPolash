package com.usa.alljava;

public class Except3 {
	public static void main(String[] args) {

		int a=99;
		int b=0;
		try {
		int c=a/b;
		}
		catch(Exception obj1) {
			System.out.println(obj1.getMessage());
		}
		System.out.println("after run");
		
	}

}
