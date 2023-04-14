package org.cross;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	 
	WebDriver driver;
	
	@Parameters("browser")
	@Test
	private void fblogginTest(String browserName) {
		
		
		if(browserName.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(opt);
		}

		else if(browserName.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		
		driver.get("https://www.facebook.com/");
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("Chandru");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
