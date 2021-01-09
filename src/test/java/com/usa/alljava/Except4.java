package com.usa.alljava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Except4 {
	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException {

		Object ff=Class.forName("com.one.Pali");
		System.out.println(ff);
		
		File ee= new File("C:\\Users\\johns\\eclipse-workspace\\Polaslibrary\\com_library\\ex\\Untitled");
		Scanner ss = new Scanner(ee);
		String a =ss.nextLine();
		System.out.println(a);
			
	}

}
