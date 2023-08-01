package curs16;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Homework1_c16 extends BaseTest{
	
	@Test
	public void testSentMessageFromContactPage() {
		
		driver.get("https://keybooks.ro/contacts/");
		
		driver.findElement(By.cssSelector("div span[class='wpcf7-form-control-wrap your-name']")).click();
		driver.findElement(By.cssSelector("div span[class='wpcf7-form-control-wrap your-name']>input")).sendKeys("Adi");
		
		driver.findElement(By.cssSelector("div span[class='wpcf7-form-control-wrap your-email']")).click();
		driver.findElement(By.cssSelector("div span[class='wpcf7-form-control-wrap your-email']>input")).sendKeys("adi@email.com");
		
		driver.findElement(By.cssSelector("div span[class='wpcf7-form-control-wrap your-s']")).click();
		driver.findElement(By.cssSelector("div span[class='wpcf7-form-control-wrap your-s']>input")).sendKeys("Test");
		
		driver.findElement(By.cssSelector("span[class='wpcf7-form-control-wrap your-message']")).click();
		driver.findElement(By.cssSelector("span[class='wpcf7-form-control-wrap your-message']>textarea")).sendKeys("Test message");
		
		driver.findElement(By.cssSelector("div input[class='wpcf7-form-control wpcf7-submit']")).click();
		
		WebElement thankYouText = driver.findElement(By.cssSelector("div [class='wpcf7-response-output']"));
		boolean thankYouTextPresent = thankYouText.equals(thankYouText);
		assertTrue(thankYouTextPresent, "Thank you for your message. It has been sent.");	
	
	}	

}
