package com.usa.alljava;

public class WrapperC {

	public static void main(String[] args) {

		int b=90;//autoboxing
		//Integer bb=Integer.valueOf(b);
		Integer bb=b;
		System.out.println(bb);
	
		Double dd=22.3;//unboxing
		//double d=dd;
		double d=Double.valueOf(dd);
		System.out.println(d);
		
		
		String a="99";//String to primitive
		//int w=Integer.valueOf(a);
		int w=Integer.parseInt(a);
		double q=Double.parseDouble(a);
		System.out.println(q);
		System.out.println(w);
		
		int uu=88;//primitive to String
		String hh=Integer.toString(uu);
		System.out.println(hh);
		
		
		
	}

}
