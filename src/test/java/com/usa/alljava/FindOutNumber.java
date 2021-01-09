package com.usa.alljava;

public class FindOutNumber {

	public static void main(String[] args) {

		// Find out which number contains 3 from 10 to 30

		for (int i = 10; i <= 30; i++) {

			if (String.valueOf(i).contains("3")) {

				System.out.println(i);

			}
		}

	}

}
