package org.datapro;

import org.dayone.BaseClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProv extends BaseClass{
	
	
	@Test(dataProvider="data1")
	private void loginTest(String username,String password) {
		 
	  browserlaunch("https://www.facebook.com/");
	  findElementID("email").sendKeys(username);
	  findElementID("pass").sendKeys(password);
	 
	  
	}
	 
	 @DataProvider(name="data1")
	 private Object[][] dataPro() {
		 
		 Object[][] data = new Object[3][2];
		 
		 data[0][0] ="anand";
		 data[0][1] ="anand@123";
		 
		 data[1][0] ="siva";
		 data[1][1] ="siav@123";
		 
		 data[2][0] ="aagash";
		 data[2][1] ="aagash@123";
		 
		  
		 return data;

	}
	

}
