package com.usa.alljava;

public class CollectArrayloopthree {

	public static void main(String[] args) {
		
		
		int g[][]= {{12,14,16,18,20},{33,36,39,41,43},{91,93,95,97,99}};
		
		for( int r=0;r<3;r++ ) {
			
			for( int c=0;c<5;c++) {
				
			System.out.println("  "+g[r][c]);	
			}
			System.out.println();
		}
		
		
		

	}

}
