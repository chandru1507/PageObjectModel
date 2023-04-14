package org.pom;

import java.awt.Window;

import org.dayone.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_login_Page extends BaseClass{
	
	public static void main(String[] args) {
		
	browserlaunch("https://www.facebook.com/");	;
	
	Facebook_Login_PagePOM a = new Facebook_Login_PagePOM();
	
    WebElement username = a.getUsername();
	
	username.sendKeys("chandru");
	
	username.clear();
	
	username.sendKeys("ramani");
	
	long startTime = System.currentTimeMillis();
	System.out.println(startTime);
	
	for (int i = 0; i < 500; i++) {
		a.getUsername().getText();
		
		}
	long endTime = System.currentTimeMillis();
	System.out.println(endTime);
	
	System.out.println("time diff:"+(endTime-startTime));
	
	System.out.println("********************************");	
	
WebElement password = a.getPassword();
	
	password.sendKeys("chandru@123");
	
	password.clear();
	
	password.sendKeys("ramani@123");
	
	long startTime1 = System.currentTimeMillis();
	System.out.println("Start time:"+startTime1);
	
	for (int i = 0; i < 500; i++) {
		a.getUsername().getText();
		
		}
	long endTime1 = System.currentTimeMillis();
	System.out.println("End Time:"+(endTime1));
	
	System.out.println("time diff:"+(endTime1-startTime1));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
