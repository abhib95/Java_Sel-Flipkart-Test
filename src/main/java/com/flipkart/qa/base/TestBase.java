package com.flipkart.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;


	public TestBase(){
		try {
			prop = new Properties();

			FileInputStream ip = new FileInputStream
					("C:\\Users\\abhishek.bhaskar\\java_proj\\FlipkartTest\\src\\main\\java\\com\\flipkart\\qa\\config\\config.properties");

			prop.load(ip);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		
		String browserName = prop.getProperty("browser");

		if(browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", 
					"C:/Users/abhishek.bhaskar/PycharmProjects/Pyhton_testing/python-selenium/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
	}
}
