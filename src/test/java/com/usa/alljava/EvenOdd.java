package com.usa.alljava;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner kk = new Scanner(System.in);
		//System.out.println("enter value=");
		int hh=kk.nextInt();
		
		
			if(hh%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			
		}
		
		
		
		
		
		  int a[]= {22,1,4,5,7,77,55,33,22,99};
		  
		  for(int i=0;i<a.length;i++) { if(a[i]%2==0) {
		  System.out.println(a[i]+"="+"even"); }else {
		  System.out.println(a[i]+"="+"odd"); } }
		 
	}

}
