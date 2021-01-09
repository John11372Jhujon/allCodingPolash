package com.usa.alljava;

public class PickLetter {

	public static void main(String[] args) {

		String a = "palaaaaaa";//pick the letter;
		int count = 0;
		for (int i = 0; i < a.length(); i++) {

			if (a.charAt(i) == 'p') {
				count++;
				System.out.println(count + "=" + a.charAt(i));
			}

		}

	}

}
