package org.parameterprog;

import org.dayone.BaseClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterProg extends BaseClass {
    
	@Parameters({"user111","pass222"})
	@Test
	private void logginTest(@Optional("admin")String username,String password) {

		browserlaunch("https://www.facebook.com/");
		findElementID("email").sendKeys(username);
		findElementID("pass").sendKeys(password);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
