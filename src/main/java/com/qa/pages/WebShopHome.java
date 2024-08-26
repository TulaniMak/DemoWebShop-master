package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import java.util.List;

public class WebShopHome extends TestBase{
	
	@FindBy(linkText ="Log in")
	private WebElement loginBtn;
        
        @FindBy(linkText ="Register")
	private WebElement registerBtn;
        
        
	public WebShopHome() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}
        
        public void registerPage(){
            registerBtn.click();
        }
	
	public void loginPage() {
		
		loginBtn.click();
	}
        
}
