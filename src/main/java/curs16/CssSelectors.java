package curs16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class CssSelectors extends BaseTest{
	
	@Test
	public void cssSelectorsExample() {
		
		WebElement selectedOption = driver.findElement(By.cssSelector("li[class*='sc_tabs_title'][aria-selected='true']"));
		
		
		
		//NOT
		List<WebElement> menuEntries = driver.findElements(By.cssSelector(null))
	}

}
