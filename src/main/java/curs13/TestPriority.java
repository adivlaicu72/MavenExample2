package curs13;

import org.testng.annotations.Test;

public class TestPriority {

	@Test(priority = 1)
	public void one() {
		System.out.println("First");
	}

	@Test(priority = 2)
	public void two() {
		System.out.println("Second");
		}

	@Test(priority = 3)
	public void three() {
			System.out.println("Third");

	}

	@Test //intai se executa ordinea alfabetica si apoi priority
	public void four() {
		System.out.println("Fourth");
	}

	@Test // atentie!!! intai ordinea alfabetica si apoi priority
	public void fifth() {
		System.out.println("Fifth");
	}

}