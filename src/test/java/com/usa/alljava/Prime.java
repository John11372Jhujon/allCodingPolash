package com.usa.alljava;



public class Prime {    // How to find prime numbers
	

	public static void main(String[] args) {

		for(int i=2;i<100;i++) {//how to get prime
			int count=0;
			for(int j=2;j<i;j++) {
			
				if(i%j==0) {
					 count++;
				}
			}
			
			if(count==0) {
				System.out.println("prime"+" ="+i);
			}else {
				System.out.println("not prime"+" ="+i);
			}
			
		}
		
	}

}
