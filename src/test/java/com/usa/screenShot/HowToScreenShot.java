package com.usa.screenShot;


import java.io.File;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToScreenShot {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		screenShotFB("faceBook_homePage");
		driver.close();

	}

	public static void screenShotFB(String fileName) throws Exception {

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(source,
				new File("C:\\Users\\johns\\git\\sujonStudy\\com_library\\ScreenShot" + fileName + "jpg"));

	}

}
