package com.usa.alljava;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IOExceptionDemo {
	
	
	public static void main(String[] args) throws IOException{
		
		String pt=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", pt+"\\ex\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");


		File pic=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(pic, new File("C:\\Users\\johns\\OneDrive\\Desktop\\pp\\sujon.png")); //Source file, desire file
		
		
	}

}
