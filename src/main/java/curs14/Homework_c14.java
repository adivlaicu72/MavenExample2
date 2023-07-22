package curs14;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Homework_c14 extends BaseTest{
	
	@Test
	public void loginTestLocatorChecking() {

		WebElement discoverText = driver.findElement(By.linkText("Login"));
		System.out.println(discoverText.getText());	
		assertEquals(discoverText.getText(), "Login");
		
		discoverText.click();
		
		WebElement discoverLogin = driver.findElement(By.id("log"));
		assertTrue(discoverLogin.isDisplayed());
		
		WebElement discoverPassword = driver.findElement(By.id("password"));
		assertTrue(discoverPassword.isDisplayed());
	
		
		
		
	}
}
