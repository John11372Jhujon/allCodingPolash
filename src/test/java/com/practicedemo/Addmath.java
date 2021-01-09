package com.practicedemo;

public class Addmath {

	static int c = 30;
	static int d = 40;

	public static void main(String[] args) {

		Addmath obje = new Addmath();
		obje.pickup();
		
		System.out.println("====================");
        obje.updown();
        
		System.out.println("++++++++++++++++++");
		//System.out.println();
		

		int a = 10;
		int b = 20;

		System.out.println("A" + "=" + a);
		System.out.println("B" + "=" + b);
		System.out.println("C" + "=" + c);
		System.out.println("D" + "=" + d);

	}

	public void pickup() {

		String w = "ShujonCorporation";

		int count = 0;

		for (int i = 0; i < w.length(); i++) {

			if (w.charAt(i) == 'o') {
				count++;

				System.out.println(count + "=" + w.charAt(i));
			}

		}
	}
	public void updown(){
		
		String f="ToyotaHighlander";
		int count = 0;
		
		for (int i=0;i<f.length();i++) {
			
			if(f.charAt(i)=='a') {
			count++;	
			
			System.out.println(count+"="+ f.charAt(i));
			}
			
			
		}
	}
}
