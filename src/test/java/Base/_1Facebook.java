package Base;

import java.io.IOException;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.FaceBook;
import freemarker.log.Logger;

public class _1Facebook extends BaseClass {
	FaceBook fb;
	Logger lg;

	@BeforeTest
	public void f1() throws IOException, URISyntaxException {
		driver = initilizeBrowser(); 
		fb = new FaceBook(driver);
		lg.info("Driver initlized");
	}
	@Test
	public void login() throws InterruptedException, IOException {

		driver.navigate().to("https://facebook.com/");
	    fb.AddEmailAddress("abc@gmail.com");
	    fb.AddFbPassword("fb@12345");
	    fb.ClickOnLoginButton();
	    
	    Thread.sleep(1000);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
