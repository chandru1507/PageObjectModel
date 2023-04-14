package org.junittest;

import org.dayone.BaseClass;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class ClassC extends BaseClass {
	
	
	
	@Test
	public void tc_1() {
		System.out.println("ClassC tc_1");

	}
	
	@Test
	public void tc_2() {
		
	//Assert(false)	
		browserlaunch("https://www.instagram.com/");
//		WebElement userName = findElementName("username");
//		userName.sendKeys("Chandru");
//		String attribute = userName.getAttribute("value");
//		Assert.assertTrue(attribute.equals("Chandru"));
//		
		
	//
		WebElement pass = findElementName("Password");
		pass.sendKeys("1223");
//		String attribute2 = pass.getAttribute("value");
//		Assert.assertEquals("1223","1223");
		System.out.println("ClassC tc_2");
		
	}
	
	@Test
	public void tc_3() {
		System.out.println("ClassC tc_3");

	}
	
	@Test
	public void tc_4() {
		System.out.println("ClassC tc_4");

	}

}
