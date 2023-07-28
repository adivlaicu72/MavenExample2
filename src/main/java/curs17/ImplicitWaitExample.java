package curs17;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.BaseTest;

public class ImplicitWaitExample extends BaseTest{
	
	@Test
	public void implicitWaitExample() {
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		driver.findElement(By.cssSelector("div[id='start']>button")).click();
		
		
		
	}
	

}
