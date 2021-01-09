package com.usa.alljava;

public class Palimdorme {
	
	
	public static void main(String[] args) {
		
		
		String a="mom";
	
		StringBuilder ss = new StringBuilder(a);
		String obj=ss.reverse().toString();
		
		
		if(a.equals(obj)) {
			
			System.out.println("It is Palimdrome");
		
		}
		
		else {
			
			System.out.println("It is not Palimdrome");
		}
		
		
		System.out.println("===================");
		
		
		for(int i=a.length()-1;i>0;i--) {
			System.out.print(a.charAt(i));
			
			
		}
			
	}

}
