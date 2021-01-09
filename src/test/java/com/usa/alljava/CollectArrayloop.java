package com.usa.alljava;

public class CollectArrayloop {
	
	public static void main(String[] args) {

		// Old way
		int a[] = new int[5];

		a[0] = 5;
		a[1] = 10;
		a[2] = 15;
		a[3] = 25;
		a[4] = 35;

		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);

		}

		System.out.println("=================");

		// New way
		int b[] = { 90, 105, 200, 300, 600, 900 };

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		System.out.println("=========================");

		// Multi dimentional
		int q[][] = { { 1, 7, 9, 12, 15 }, { 19, 21, 23, 25, 27 }, { 29, 31, 33, 39, 45 } };

		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 5; c++) {

				System.out.print(" " + q[r][c]);
			}
			System.out.println();
		}
		System.out.println("==========================================");
	}

}
