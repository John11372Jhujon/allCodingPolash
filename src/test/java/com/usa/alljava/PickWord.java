package com.usa.alljava;

public class PickWord {

	public static void main(String[] args) {

		String a = "this@is@an@apple@is";// pick the word;
		String[] ss = a.split("@");
		int cc = 0;// for counting the word
		for (String pp : ss) {
			//cc++;//this is for index
			if (pp.equals("is")) {
				cc++;//this cc for counting

				System.out.println(cc + "=" + pp);
			}

		}
	}

}
