package com.usa.alljava;

public class StrBuffBuild {

	public static void main(String[] args) {

		String s = "Pioneer ";  // String connect old way
		String r = "Electric";

		String obj = s.concat(r);
		System.out.println(obj);

		System.out.println("=============");

		String u = new String("Sony ");   // String connect new way
		String v = new String("4kUHD");

		String ans = u.concat(v);
		System.out.println(ans);

		System.out.println("=====================");

		String cdi = "HondaMotor";  // Reverse String new way

		StringBuilder ff = new StringBuilder(cdi);
		String uv = ff.reverse().toString();

		System.out.println(uv);
		
		System.out.println("===============================");
		
		StringBuffer ll=new StringBuffer("John ");
		StringBuffer pp=new StringBuffer("Shujon");
		ll.append(pp);
		
		System.out.println(ll); 
		
		System.out.println("+++++++++++++++++++++++++++++");
		
		String j= "bangladesh";
		
		StringBuilder k=new StringBuilder(j);
		String w=k.reverse().toString();
		
		System.out.println(w);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		String x="Nazmul  ";
		String y="Huda";
		
		String name=x.concat(y);
		
		System.out.println(name);
		
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		String adress="NewYork";
		
		StringBuffer rv=new StringBuffer(adress);
		String res=rv.reverse().toString();
		
		System.out.println(res);
		
		System.out.println("&&&&&&&&&&&&&&");
		
		for(int i=adress.length()-1;i>0;i--) {
			System.out.print(adress.charAt(i));
		}
		
		

		
		
		
		
		

	}

}
