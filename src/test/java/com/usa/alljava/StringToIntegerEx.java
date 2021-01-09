package com.usa.alljava;

public class StringToIntegerEx {

	public static void main(String[] args) {
		
		
		//String to Int or double.
		
		
		String salary="10000";
		
		int a=Integer.parseInt(salary);
		
		//One Way
		System.out.println("String to Integer Salary ="+a);
		//Another Way
	    System.out.println(Integer.parseInt(salary));
		
		System.out.println("++++++++++++++++");
		
		String bonus="30000.12";
		
		double b=Double.parseDouble(bonus);
		
		System.out.println("String to Double ="+b);
		
		
		String bribe="60000";
		
		int q=Integer.parseInt(bribe);
		System.out.println("Bribe "+"="+q);
		
		

	}

}
