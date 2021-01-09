package com.usa.alljava;

public class CollectArraySample {
	
	
	
	public static void main(String[] args) {
		
		int a[]= new int[2];//old fashion
		
		a[0]=11;
		a[1]=22;
		
		for(int i=0;i<2;i++) {
			System.out.println(a[i]);
		}
	

		System.out.println("====================");
		
		
		int b[]= {2,34,5,56,77,88};//new fashion
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		
		System.out.println("==============================");
		
		//System.err.println("================");
		
		int p[][] = {{22,33,44,55,66},{55,55,66,77,88},{22,55,66,88,99}};
		
		for(int r=0;r<3;r++) {
			for(int c=0;c<5;c++) {
				System.out.print(" "+p[r][c]);
			}
			System.out.println();
			
		}
		
			
	}

}
