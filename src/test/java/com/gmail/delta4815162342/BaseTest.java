package com.gmail.delta4815162342;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	protected static WebDriver driver;

	@BeforeMethod
	protected static void driverInit() {
		String exePath = "D:\\Program Files\\chromedriver.exe";

		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", exePath);
			driver = new ChromeDriver();
		}
	}
	
	@AfterMethod
	protected static void closeDriver() {
		//driver.quit();
	}
}
