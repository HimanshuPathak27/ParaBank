package com.parabank.driverscript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;


public class TestBase {
	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties config = new Properties();

	@BeforeSuite
	public WebDriver setup() throws IOException{
		try {
			fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\parabank\\driverscript\\configuration.properties");
			config.load(fis);
			Reporter.log("Configuration File is loaded successfully");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}

		if(config.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if(config.getProperty("browser").equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}

		else if(config.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicitWait")), TimeUnit.SECONDS);

		driver.get(config.getProperty("url"));

		driver.manage().window().maximize();

		return driver;
	}

	@AfterSuite
	public void tearDown() {
		if(driver!= null) {
			driver.quit();
			Reporter.log("Application is Closed Successfully");
		}
	}

}
