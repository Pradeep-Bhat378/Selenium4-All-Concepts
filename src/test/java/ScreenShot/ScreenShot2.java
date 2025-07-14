package ScreenShot;

import java.io.File; 
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Utils.Generic;


public class ScreenShot2 {

	public WebDriver driver;
   public  String timestamp;
    public Generic ge;
    
	
	@Test
	public void a1() throws IOException {
		ge =  new Generic();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		

		ge.getScreenshot(driver);
		
	}

	@AfterTest
	public void a2() {
		
		driver.quit();
	}
}
