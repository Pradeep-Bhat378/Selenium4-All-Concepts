package ScreenShot;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utils.ScreenShotRelated;

public class TakeScreenshotOfElement {

	
	WebDriver driver;
	public ScreenShotRelated sr;
	
	@Test
	public void f1() throws IOException {
		
		sr = new ScreenShotRelated();
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.navigate().to("https://omayo.blogspot.com/");
		
		WebElement submit = driver.findElement(By.xpath("//button[normalize-space(text())='Submit']"));
		
		sr.getScreenshotElement(submit);
		
		driver.quit();
		
	}
}
