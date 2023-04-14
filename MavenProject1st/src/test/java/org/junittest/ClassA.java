package org.junittest;

import org.dayone.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassA extends BaseClass {
	
	
	@BeforeClass
	public static void tc_1() {
		
		browserlaunch("https://www.facebook.com/");
		System.out.println("ClassA tc_1 @BeforeClass");

	}
	
	@AfterClass
	public static void tc_2() {
		browserClose();
		System.out.println("ClassA tc_2 @AfterClass");

	}

	@Before
	public void tc_3() {
		long starttime = System.currentTimeMillis();
		System.out.println(starttime);
		System.out.println("ClassA tc_3 @Before");

	}
	
	@After
	public void tc_4() {
		long endtime = System.currentTimeMillis();
		System.out.println(endtime);
		System.out.println("ClassA tc_4 @After");

	}
	@Ignore
	@Test
	public void tc_5() {
		WebElement username = findElementID("email");
		sendvalues(username, "Chandru");
		WebElement password = findElementID("pass");
		sendvalues(password, "12345");
		System.out.println("ClassA tc_5 @Test");

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
