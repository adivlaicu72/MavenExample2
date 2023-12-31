package curs17;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Homework1_c17 extends BaseTest{

	
	@Test
	public void theWickedKingSearchBook() {
		driver.get("https://keybooks.ro/");
		driver.findElement(By.cssSelector("div>form button")).click();
		driver.findElement(By.className("search_field")).sendKeys("king");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("The Wicked King")).click();
		
		WebElement category = driver.findElement(By.className("posted_in"));
		assertEquals(category.getText(), "Category: New releases");
		
		WebElement productID = driver.findElement(By.className("product_id"));
		assertEquals(productID.getText(), "Product ID: 1709");
		
		WebElement theWickedKing1 = driver.findElement(By.className("flex-active"));
		boolean theWickedKing1Present = theWickedKing1.isDisplayed();
		assertTrue(theWickedKing1Present, "TheWickedKing1.png is exist");
		
		WebElement theWickedKing2 = driver.findElement(By.className("flex-active"));
		boolean theWickedKing2Present = theWickedKing2.isDisplayed();
		assertTrue(theWickedKing2Present, "TheWickedKing2.png is exist");
		
		WebElement theWickedKing3 = driver.findElement(By.className("flex-active"));
		boolean theWickedKing3Present = theWickedKing3.isDisplayed();
		assertTrue(theWickedKing3Present, "TheWickedKing2.png is exist");
		
		WebElement theWickedKing4 = driver.findElement(By.className("flex-active"));
		boolean theWickedKing4Present = theWickedKing4.isDisplayed();
		assertTrue(theWickedKing4Present, "TheWickedKing2.png is exist");

		
	}

}