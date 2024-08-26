package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class WebShopLogin extends TestBase {
	
	@FindBy(id="Email")
	private WebElement emailbox;
	
	@FindBy(id="Password")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement loginBtn;
        
        
	
	public WebShopLogin() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void loginWebshop() {
		
		this.emailbox.sendKeys("tulani@test.com");
		this.password.sendKeys("Test1234!");
		loginBtn.click();
                
	}

}
