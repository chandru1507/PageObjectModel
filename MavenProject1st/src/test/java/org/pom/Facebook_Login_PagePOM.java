package org.pom;

import org.dayone.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Facebook_Login_PagePOM extends BaseClass {
	
	
	public Facebook_Login_PagePOM() {
		
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBys({@FindBy(id="email"),@FindBy(xpath="//input[@id='email']")})
	private WebElement username;
	
	
	@CacheLookup
	@FindAll({@FindBy(id="paas"),@FindBy(xpath="//input[@id='pass']")})
	private WebElement password;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
