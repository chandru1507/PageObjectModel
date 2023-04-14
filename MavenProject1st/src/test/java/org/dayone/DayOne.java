package org.dayone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DayOne {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.google.com/mail/u/0/");
		
				
		
		

	}

}
