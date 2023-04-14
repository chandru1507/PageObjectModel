package org.framesselenium;

import java.util.List;

import org.dayone.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FramesClassSelenium extends BaseClass{
	
public static void main(String[] args) {
	
//	browserlaunch("https://chercher.tech/practice/frames-example-selenium-webdriver");
//	
//	List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
//	int size = findElements.size();
//	System.out.println(size);
//	
//	driver.switchTo().frame(0);
//	
//	WebElement element = driver.findElement(By.tagName("input"));
//	
//	element.sendKeys("hi");
//	
//	driver.switchTo().frame("frame3");
//	WebElement element2 = driver.findElement(By.id("a"));
//	
//	element2.click();
//	
//	driver.switchTo().defaultContent();
//	
//	WebElement element3 = driver.findElement(By.id("frame2"));
//	
//	driver.switchTo().frame(element3);
//	
//	WebElement element4 = driver.findElement(By.id("animals"));
//	
//	
//	Select select = new Select(element4);
//	
//	select.selectByIndex(3);
//	
//	
	
	browserlaunch("https://chercher.tech/practice/frames-example-selenium-webdriver");
	
	List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
	int size = findElements.size();
	System.out.println(size);
	
	driver.switchTo().frame(0);
	
	WebElement element = driver.findElement(By.tagName("input"));
	
	element.sendKeys("hi");
	
	driver.switchTo().frame("frame3");
	WebElement element2 = driver.findElement(By.id("a"));
	
	element2.click();
	
	driver.switchTo().parentFrame();
	
	element.clear();
	element.sendKeys("chandru");
}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
