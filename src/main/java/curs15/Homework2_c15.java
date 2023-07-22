package curs15;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Homework2_c15 extends BaseTest{
	
	@Test
	public void cssSelector() {

		driver.findElement(By.cssSelector("div[class='search_form_wrap']")).click();
		
		driver.findElement(By.cssSelector("div[class='search_form_wrap']")).sendKeys("The story about me");


	}
}
