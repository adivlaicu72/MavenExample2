package curs12;


import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumTest {
	
		
		@Test
		public void openBrowser() {
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		
//		WebDriverManager.chromedriver().setup();
		
		WebDriverManager.firefoxdriver().setup();
//	    WebDriver driver = new ChromeDriver();	
		WebDriver driver = new FirefoxDriver();
			driver.get("https://keybooks.ro/");
		}
	}

