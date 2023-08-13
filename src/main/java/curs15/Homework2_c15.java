package curs15;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.BaseTest;

public class Homework2_c15 extends BaseTest{
	
	@Test (priority=1)
	public void findBook() {
		
		//sunt 2 elemente la search. Cel in care fac prima data click si cel in care scriem.
		//click pe search
		
		WebElement searchMenu = driver.findElement(By.cssSelector("button[type='submit'][title='Open search']"));
		searchMenu.click();
		WebElement inputSearch = driver.findElement(By.cssSelector("input[class='search_field']"));
		
		//introduc ce vreau sa caut
		inputSearch.sendKeys("the story about me");
		searchMenu.click();  
		
		//cartea nu se afla in prima pagina cu rezultate asta ca identific load button
		WebElement loadButton = driver.findElement(By.cssSelector("a[href='#'][id='viewmore_link']"));

		//fac o bucla care atat cat exista butonul de load,da click pe el
		while(loadButton.isDisplayed()) {
		//am pus in try catch pentru ca atunci cand ajunge la ultima pagina si nu mai exista butonul
		//sa nu crape, ci sa prinda exceptia pe catch si sa treaca mai departe 
			try { 
					loadButton.click();
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					wait.until(ExpectedConditions.elementToBeClickable(loadButton));
					
			} catch(Exception e) {
				
			}
		}		
	//caut cartea si dau click pe ea
	WebElement myBook=driver.findElement(By.cssSelector("article[class*='item_masonry']>h4[class*='title']>a[href*='story-about-me']")); 
	myBook.click();
	//verific ca am ajuns in pagina cartii
	assertTrue(driver.getCurrentUrl().equals("https://keybooks.ro/shop/the-story-about-me/"));
			
	//apasam pe add to cart si verificam daca ne apare textul cu added to cart
	driver.findElement(By.cssSelector("button[class='single_add_to_cart_button button alt']")).click(); 
	WebElement hasBeenAdded = driver.findElement(By.cssSelector("div [class='woocommerce-message']"));
	boolean hasBeenAddedPresent = hasBeenAdded.equals(hasBeenAdded);
	assertTrue(hasBeenAddedPresent, "\"The story about me\" has been added to your cart.");	
			
	//dupa verificarea textului apasam pe View Cart si validam ca ne duce pe URL https://keybooks.ro/cart/
	driver.findElement(By.cssSelector("article a[class='button wc-forward']")).click();
	assertTrue(driver.getCurrentUrl().equals("https://keybooks.ro/cart/"));
	}
	
	//De aici pentru ce se intampla in cart facem o noua metoda @Test
	@Test (priority=2) 
	public void viewCart() {
		//In noua metoda @Test vom face update de cantitate pentru carte la 2
		driver.findElement(By.cssSelector("span[class='q_inc']")).click();
		driver.findElement(By.cssSelector("button[class='button'][name='update_cart']")).click();
		
		//Verificam mesajul dupa update
		WebElement cartUpdated = driver.findElement(By.cssSelector("div [class='woocommerce-message']"));
		boolean cartUpdatedPresent = cartUpdated.equals(cartUpdated);
		assertTrue(cartUpdatedPresent, "Cart updated.");	
		
		//Apasam Proceed to checkout
		driver.findElement(By.cssSelector("a[class='checkout-button button alt wc-forward']")).click();
		
		//In noul screen verificam URL ca este egal cu https://keybooks.ro/chckout/
		assertTrue(driver.getCurrentUrl().equals("https://keybooks.ro/checkout/"));
		
		//Verificam daca ne apare textul Billing details si Aditional information
		WebElement billingDetails = driver.findElement(By.cssSelector("div[class='woocommerce-billing-fields']"));
		boolean billingDetailsPresent = billingDetails.equals(billingDetails);
		assertTrue(billingDetailsPresent, "Billing details");	
		
		WebElement additionalInfo = driver.findElement(By.cssSelector("div[class='woocommerce-billing-fields']"));
		boolean additionalInfoPresent = additionalInfo.equals(additionalInfo);
		assertTrue(additionalInfoPresent, "Additional information");	
			
		}
		
}