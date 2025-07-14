package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QaFox {
	
	WebDriver driver;
	
	public QaFox(WebDriver driver) {
		
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(xpath = "//option[normalize-space(text())='Volvo']")
	WebElement volvoOption;

	
	public void SelectVolve() {
		volvoOption.click();
	}
	

}
