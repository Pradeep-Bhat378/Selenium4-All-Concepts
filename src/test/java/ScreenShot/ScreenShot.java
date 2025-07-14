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

import Base.BaseClass;
import Utils.ScreenShotRelated;


public class ScreenShot extends BaseClass {

	WebDriver driver;
	ScreenShotRelated sr;
	
    String timestamp; 
	
	@Test
	public void a1() throws IOException {
        driver = initilizeBrowser();        
		driver.get("https://omayo.blogspot.com/");
		
		sr.getScreenshot(driver);
		
	}

	@AfterTest
	public void a2() {
		
		driver.quit();
	}
}
