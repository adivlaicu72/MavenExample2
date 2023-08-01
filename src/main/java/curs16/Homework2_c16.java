package curs16;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Homework2_c16 extends BaseTest{
	
	@Test
	public void testReviews() throws InterruptedException {
		
		driver.get("https://keybooks.ro");
		
		driver.findElement(By.cssSelector("div h3 [href='life-in-the-garden']")).click();
		driver.findElement(By.cssSelector("div ul li a[href='#tab-reviews']")).click();
		
		WebElement saveMeCheck = driver.findElement(By.cssSelector("input[id='wp-comment-cookies-consent']"));
		assertFalse(saveMeCheck.isSelected());
		
		saveMeCheck.click();
		driver.findElement(By.cssSelector("[id='submit']")).click();
		Thread.sleep(4000);
		//handle the the testReview JS alert
		driver.switchTo().alert().accept();
		
		driver.findElement(By.cssSelector("p span [class='star-3']")).click();
		driver.findElement(By.cssSelector("p [id='comment']")).sendKeys("Test");
		driver.findElement(By.cssSelector("p [id='author']")).sendKeys("Adi");
		driver.findElement(By.cssSelector("p [id='email']")).sendKeys("adi@email.com");
		
		assertTrue(saveMeCheck.isSelected());
		
		driver.findElement(By.cssSelector("p [id='submit']")).click();
		
		WebElement reviewIsAwaitingApproval = driver.findElement(By.cssSelector("p [class='woocommerce-review__awaiting-approval']"));
		boolean reviewIsAwaitingApprovalPresent = reviewIsAwaitingApproval.equals(reviewIsAwaitingApproval);
		assertTrue(reviewIsAwaitingApprovalPresent, "Your review is awaiting approval");
				
	}	

}
