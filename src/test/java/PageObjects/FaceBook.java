package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FaceBook extends BasePage {

	public FaceBook(WebDriver driver) {
		super(driver);
	}

	@CacheLookup
	@FindBy(id="email")
	WebElement emailField;
	
	@CacheLookup
	@FindBy(id="pass")
	WebElement password;
	
	@CacheLookup
	@FindBy(xpath ="//button[normalize-space(text())='Log in']")
	WebElement Login;
	
	public void AddEmailAddress(String email) {
	    new WebDriverWait(driver, Duration.ofSeconds(10))
	        .until(ExpectedConditions.visibilityOf(emailField));
	    emailField.click();
	    emailField.clear();
	    emailField.sendKeys(email);
	}

	public void AddFbPassword(String pwd) {
		password.click();
		password.clear();
		password.sendKeys(pwd);
	}
	
	public void ClickOnLoginButton() {
		Login.click();
	}
	
	
}
