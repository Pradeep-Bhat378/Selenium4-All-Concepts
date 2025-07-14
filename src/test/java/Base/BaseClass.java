package Base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	static WebDriver driver;
	static Logger logger;
	static Properties p;

	public static Properties getProperties() throws IOException {

		FileReader file = new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties");
		p = new Properties();
		p.load(file);

		return p;
	}
	
	public static Logger getLogger() 
	{		

		logger=LogManager.getLogger(); //Log4j
		return logger;
	}

	public static WebDriver getWebDriver() {

		return driver;

	}

	public WebDriver initilizeBrowser() throws IOException {

		switch (getProperties().getProperty("browser").toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("No matching browser found");
			driver = null;
			break;

		}
		if (driver != null) {
           driver.manage().deleteAllCookies();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

		return driver;
	}
	
	
}
