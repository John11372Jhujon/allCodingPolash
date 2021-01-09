package com.usa.readwritexl;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class FileSeralization {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		FileInputStream file=new FileInputStream("");
		
		
		//for specify which xl sheet we need to read
		Workbook wb=WorkbookFactory.create(file);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
