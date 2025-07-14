package Utils;

import java.io.File; 
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScreenShotRelated {

	//WebDriver driver;
	
    String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	
	
	public void getScreenshot(WebDriver driver) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./Screenshot/Util_"+timestamp +".png"));
		return;
		
	}
	
	public void getScreenshotElement(WebElement element) throws IOException {
		
		File file = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./Screenshot/Element_"+timestamp +".png"));
		return;
	}
}
