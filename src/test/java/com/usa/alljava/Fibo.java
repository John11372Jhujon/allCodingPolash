package com.usa.alljava;



public class Fibo {

	public static void main(String[] args) {

		int a=0;//fibo
		int b=1;
		int fibo;
		
		for(int i=0;i<11;i++) {
			fibo=a+b;
			a=b;
			b=fibo;
			
			System.out.println(fibo);
		}
		
		
	}

}
