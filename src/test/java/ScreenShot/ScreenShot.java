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


public class ScreenShot {

	WebDriver driver;
    String timestamp; 
	
	@Test
	public void a1() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

		
		TakesScreenshot ss = (TakesScreenshot)driver;
	    File file = ss.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(file, new File("./Screenshot/I"+timestamp+".png"));
		
		
	}

	@AfterTest
	public void a2() {
		
		driver.quit();
	}
}
