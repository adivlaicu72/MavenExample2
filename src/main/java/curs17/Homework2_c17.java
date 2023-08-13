package curs17;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utils.BaseTest;


//WebElement finish = driver.findElement(By.cssSelector("div[id='finish']>h4"));
//assertEquals(finish.getText(), "Hello World!");

@Test
public class Homework2_c17 extends BaseTest{
	
	public void singleAuthor() throws InterruptedException {

		
		driver.get("https://keybooks.ro/");
		driver.findElement(By.linkText("SINGLE AUTHOR")).click();
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//	    wait.until(ExpectedConditions.textToBePresentInElement("skillDramaPercent" , "95%"));
		
		List<WebElement> skills = driver.findElements(By.className("sc_skills_label"));
		System.out.println(skills.size());
		
		for(WebElement skill : skills) {
			
			 
		      WebElement skillDrama = driver.findElement(By.xpath("//div[contains(text(), 'Drama')]")); 
		      assertTrue(skillDrama.isDisplayed());	
		      
//		      WebElement skillDramaPercent = driver.findElement(By.xpath("//div[contains(text(), '95%')]"));
//		      boolean skillDramaPercentPresent = skillDramaPercent.isDisplayed();
//		      assertTrue(skillDramaPercentPresent, "95%");	
		         
		            
		      WebElement skillBiography = driver.findElement(By.xpath("//div[contains(text(), 'Biography')]")); 
		      assertTrue(skillBiography.isDisplayed());	      
		      
		      WebElement skillCookbooks = driver.findElement(By.xpath("//div[contains(text(), 'Cookbooks')]"));
		      assertTrue(skillCookbooks.isDisplayed());	      
		      
		
		}
	}	
	
	
}