package curs15;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Homework1_c15 extends BaseTest {
	
	@Test
	public void findTheForestBook() {
		List<WebElement> menuOptions = driver.findElements(By.className("sc_tabs_title"));
		System.out.println(menuOptions.size());
		
		
		
//		for (WebElement opt : options) {
//			if (opt.getText().equals("The forest")) {
//				opt.click();
//			}
//		}
//		
//		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/the-forest/");		

	
	}

}


