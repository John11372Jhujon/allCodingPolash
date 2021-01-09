package com.usa.alljava;

public class OopDemo1 {
	
	private static int a;
	/*
	 * public void say(int a) { this.a=a; System.out.println(a); } public void
	 * say1() { System.out.println(a); } public void say2() { System.out.println(a);
	 * } public void say3() { System.out.println(a); }
	 */

	OopDemo1(int a){
		this.a=a;
		System.out.println(a);
	}

	OopDemo1(String b,int a){
		System.out.println(b);
		System.out.println(a);
	}
	public static void main(String[] args) {
		OopDemo1 hh = new OopDemo1(100);
		OopDemo1 hh1 = new OopDemo1("sss", a);
		
	}

	
}
