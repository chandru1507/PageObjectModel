package org.assertion;

import org.dayone.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo extends BaseClass{
	
	@Test(enabled=true)
	public void asserttest1() {
		
		browserlaunch("https://www.google.com/");
		String title = driver.getTitle();
      //   Assert.assertEquals(title,"google","verifying the page title actual vs expected");
         
		boolean flag =false;
		if(title.contains("go")) {
			flag=true;
		}
		
		
		Assert.assertTrue(flag);
         driver.navigate().refresh();
         driver.close();
	}
	
	@Test(enabled=false)
	public void asserttest2() {
		
		browserlaunch("https://www.google.com/");
		String title2 = driver.getTitle();
		
		SoftAssert softassertion=new SoftAssert();
		softassertion.assertEquals(title2,"google");
          driver.navigate().refresh();
         driver.close();
         softassertion.assertAll();
	}


}
