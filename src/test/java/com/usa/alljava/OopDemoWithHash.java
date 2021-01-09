package com.usa.alljava;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OopDemoWithHash {
	
	
	public static HashMap<String, String> data() {
		
		HashMap<String,String> hh = new HashMap<String, String>();
		
		hh.put("one", "pa@gmail.com@p123@abc");  //HashMap no Guarantee, ascending order or inserted order
		hh.put("two", "su@gmail.com@p123");
		hh.put("three", "pj@gmail.com@p123");
		
		return hh;
		
		}
	
	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",path+"\\allDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String gg=data().get("one");
		String[] real=gg.split("@");//regex
		
		
		driver.findElement(By.id("email")).sendKeys(real[0]);
		driver.findElement(By.id("pass")).sendKeys(real[1]);
		driver.findElement(By.name("firstname")).sendKeys(real[2]);
		
	}
	
	

}
