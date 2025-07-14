package Base;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.*;

import PageObjects.FaceBook;

public class Facebook_DataDriven extends BaseClass {

    FaceBook fb;
    Logger logger;

    @BeforeClass
    public void setUp() throws IOException {
        logger = LogManager.getLogger(Facebook_DataDriven.class);
        logger.info("----- Logs started for Facebook Login Test -----");

        driver = initilizeBrowser();
        fb = new FaceBook(driver);
        logger.info("Driver initialized");
        driver.get("https://www.facebook.com/");
        logger.info("Navigated to Facebook");
    }

    @Test(dataProvider = "fbb")
    public void FaceBook_Login(String email, String pwd) {
        logger.info("=== Executing login test with: " + email + " | " + pwd + " ===");

        fb.AddEmailAddress(email);
        logger.info("Entered email: " + email);

        fb.AddFbPassword(pwd);
        logger.info("Entered password.");

        fb.ClickOnLoginButton();
        logger.info("Clicked login button");
        
        // Optional: Add assertion or capture screenshot
    }

    @AfterMethod
    public void tearDown() {
        logger.info("Clearing cookies after test");
        driver.manage().deleteAllCookies(); // Clean browser state for next test
    }

    @AfterClass
    public void closeBrowser() {
        logger.info("Closing browser after all tests");
        driver.quit();
    }

    @DataProvider(name = "fbb")
    public Object[][] loginData() {
        return new Object[][] {
            { "4pradeep4@gmail.com", "soumyashree" },
            { "abc@gmail.com", "kakd" },
            { "fff@gmail.com", "jhhj" },
            { "", "" } // Use "" instead of " " (space) to test empty fields
        };
    }
}
