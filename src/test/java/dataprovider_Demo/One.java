package dataprovider_Demo;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class One {
	
	static WebDriver driver;
	
	@Test(dataProvider="dp")
	public void data(String uid,String upass) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\johns\\git\\sujonStudy\\com_library\\allDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		  //HashMap<String, String> hh = new HashMap<String, String>(); 
		  
		 // hh.put("one", "aaa#111");
		 // hh.put("two", "bbb#222");
		 //// hh.put("three", "ccc#333");
		  
		 // String value=hh.get("two");
		  
		  //String[] fv=value.split("#");
		 
		
		driver.findElement(By.id("username")).sendKeys(uid);
		Thread.sleep(2000l);
		driver.findElement(By.id("password")).sendKeys(upass);
		Thread.sleep(2000l);
		driver.findElement(By.id("Logi")).click();  
		
	}
	
	
	@DataProvider
	public Object[][] dp() {
		
		Object [][] dd= {{"qqq","111"},{"www","222"}};
		
		return dd;
		
	}
	
	public void failScreenShot(String gg) throws Exception {
		
		
		File ff= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(ff, new File("C:\\Downloads\\all_ScreenShot\\"+ss+"john.png"));
		
		FileUtils.copyFile(ff, new File("C:\\Users\\johns\\OneDrive\\Pictures\\ScreenShot"+gg+"john.png"));
		
		
		
		
	}
	
	
}
	
	
	
	
	

