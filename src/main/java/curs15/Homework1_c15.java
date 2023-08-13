package curs15;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Homework1_c15 extends BaseTest {
	
	@Test
	public void findTheForestBook() throws InterruptedException{
		List<WebElement> menuOptions = driver.findElements(By.className("sc_tabs_title"));
		System.out.println(menuOptions.size());

		//in for dam click pe fiecare tab si trebuie sa identificam cartea             
		//si sa verificam daca exista (metoda isDisplayed())
		
		for(WebElement element : menuOptions) {
		      //gasim cartea
		      WebElement forestBook = driver.findElement(By.cssSelector("div[aria-hidden='false'] a[href='the-forest']")); 
		      Thread.sleep(1000);// sleep doar ca sa pot urmari cand rulez
		      //dau click pe fiecare element din meniu
		      element.click();
		      //verific daca cartea exista
		      assertTrue(forestBook.isDisplayed());	      
		      }
		
		//dam click pe carte in afara for-ului, pentru ca aici deja sunt pe ultimul tab
		//ca am ajuns la finalul for-ului
		driver.findElement(By.cssSelector("div[aria-hidden='false'] a[href='the-forest']")).click();  
		
		//verific url ca este url cartii 
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/the-forest/");
		
	}

}


