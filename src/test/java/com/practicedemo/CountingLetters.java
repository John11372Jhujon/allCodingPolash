package com.practicedemo;

public class CountingLetters {

	public static void main(String[] args) {

		CountingLetters p = new CountingLetters();

		p.pickletterOne();
		p.pickletterTwo();

		String b = "ShujonSoki";
		int count = 0;

		for (int i = 0; i < b.length(); i++) {

			if (b.charAt(i) == 'S') {
				count++;
				System.out.println(count + "=" + b.charAt(i));

			}
		}

	}

	public void pickletterOne() {

		String r = "germany";
		int count = 0;

		for (int v = 0; v < r.length(); v++) {

			if (r.charAt(v) == 'g') {
				count++;
				System.out.println(count + "=" + r.charAt(v));
				System.out.println("2+++++++++++++++++++++");
			}

		}

	}

	public void pickletterTwo() {

		String j = new String("NewZelandd");
		int count = 0;

		for (int i = 0; i < j.length(); i++) {

			if (j.charAt(i) == 'd') {
				count++;

				System.out.println(count + "=" + j.charAt(i));
				System.out.println("3++++++++++++++++");
			}

		}
	}

}
