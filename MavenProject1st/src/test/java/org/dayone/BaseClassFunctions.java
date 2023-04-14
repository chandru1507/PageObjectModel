package org.dayone;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class BaseClassFunctions {
	
	
	
	public static void main(String[] args) throws IOException {
		BaseClass b = new BaseClass();
		b.browserlaunch("https://www.facebook.com/");
		
		
		
		
//		WebElement username = b.findElementID("email");
//		WebElement password = b.findElementID("pass");
////		WebElement loggin = b.findElementName("login");
		
		
		
//		b.clickvalues(loggin);
		
		

//		b.browserlaunch("https://demo.automationtesting.in/Alerts.html");
//		WebElement btn = b.findElementText("//a[text()='Alert with OK & Cancel']");
//		b.clickvalues(btn);
//		WebElement btn1 = b.findElementText("//button[text()='click the button to display a confirm box ']");
//		b.clickvalues(btn1);
//		
		
		String dataFromExcel = b.getDataFromExcel("C:\\Users\\Chandru\\eclipse-workspace\\MavenProject1st\\src\\test\\resources\\"
				+ "ExcelFiles\\Framework.xlsx", "TestData", 1, 1);
		
		b.sendvalues(b.findElementID("email"), dataFromExcel);
		b.sendvalues(b.findElementID("pass"), "12345");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
