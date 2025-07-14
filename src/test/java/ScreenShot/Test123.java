package ScreenShot;

import java.io.File; 
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Test123 {

	WebDriver driver;
	
	@Test
	public void a1() throws IOException {
		
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://mvnrepository.com/");
	    
	    TakesScreenshot ss = (TakesScreenshot)driver;
	    File f1 = ss.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(f1, new File("./ScreenShot/kl.jpg"));
	    driver.quit();		
	    
	}
	
}
