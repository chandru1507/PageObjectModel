package org.rerunautomation;

import static org.testng.Assert.assertEquals;

import org.dayone.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases extends BaseClass{
	
	
	@BeforeTest
	public void beforetest() {
		WebDriver driver;
		browserlaunch("https://www.google.com/");
		

	}

	@AfterTest
	public void aftertest() {
		driver.close();

	}

	@Test
	public void testing() {
		String title = driver.getTitle();
		assertEquals(title,"google");
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
