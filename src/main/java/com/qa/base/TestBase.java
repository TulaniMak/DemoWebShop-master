package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {

		try {
			prop = new Properties();

			FileInputStream file = new FileInputStream("C:\\Users\\Tulan\\Downloads\\DemoWebShop-master\\DemoWebShop-master\\src\\main\\java\\com\\qa\\config\\config.properties");

			prop.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void initialization() {

		String browser = prop.getProperty("Browser");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tulan\\Downloads\\DemoWebShop-master\\DemoWebShop-master\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("URL"));

	}

}
