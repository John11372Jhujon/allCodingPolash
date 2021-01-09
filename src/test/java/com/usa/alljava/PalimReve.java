package com.usa.alljava;

public class PalimReve {

	public static void main(String[] args) {
		
		
		
		
		String xy = "shujon";

		StringBuilder mm = new StringBuilder(xy);
		String obj = mm.reverse().toString();

		System.out.println(obj);

		if (xy.equals(obj)) {
			System.out.println("It is Palimdrome");
		}

		else {
			System.out.println("it is not palimdrome");
		}

		System.out.println("=================");

		for (int i = xy.length() - 1; i >=0; i--) {
			
			System.out.print(xy.charAt(i));
		}
		
		
		

	}

}
