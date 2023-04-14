package org.junittest;

import org.dayone.BaseClass;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class ClassB extends BaseClass {
	
	
	
	@Test
	public void tc_1() {
		System.out.println("ClassB tc_1");

	}
	
	@Test
	public void tc_2() {
		
	//Assert(True)	
		browserlaunch("https://www.facebook.com/");
		WebElement userName = findElementID("email");
		userName.sendKeys("Bala");
		String attribute = userName.getAttribute("value");
		Assert.assertTrue(attribute.equals("Bala"));
	
	
   //Assert Equals with Message Passing	
		WebElement password = findElementID("pass");
		password.sendKeys("12345");
		String attribute2 = password.getAttribute("value");
		Assert.assertEquals("ClassB tc_2","12345", "12345");
		System.out.println("ClassB tc_2");

	}
	
	@Test
	public void tc_3() {
		System.out.println("ClassB tc_333");

	}
	
	@Test
	public void tc_4() {
		System.out.println("ClassB tc_4");

	}

}
