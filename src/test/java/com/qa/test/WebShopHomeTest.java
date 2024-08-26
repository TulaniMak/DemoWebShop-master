package com.qa.test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.base.TestBase;
import com.qa.pages.WebShopDesktops;
import com.qa.pages.WebShopHome;
import com.qa.pages.WebShopLogin;
import com.qa.pages.WebShopRegister;

public class WebShopHomeTest extends TestBase {
	
	
	WebShopHome home;
        WebShopRegister register;
        WebShopDesktops desktops;
        WebShopLogin login;
	
	public WebShopHomeTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		home=new WebShopHome();
                login = new WebShopLogin();
                register = new WebShopRegister();
                desktops = new WebShopDesktops();
                
	}
	@Test
        public void registrationTest(){
            //Setup
            home.registerPage();
            
            //Act + Assert
            register.fillFormAndRegister("tewr", "tedst",register.generateRandomEmail(),"Test1234!");
        
        }
        
        @Test
        public void loginTest(){
            //Setup
            home.loginPage();
            
            //Act 
            login.loginWebshop();
        }
        
        @Test
        public void computerTabTest(){
            desktops.clickCategory();
        }
        
        @Test
        public void selectDesktopOptionsTest(){
            //Setup 
            //Click on computers tab
            desktops.clickCategory();
            
            //Act + Assert
            //Select desktops option
            desktops.clickCategorySubMenu();
        }
        
        @Test
        public void addAllDesktopsToCartThenRemoveOneItemAndCompleteOrder(){
            //Setup
            home.registerPage();
            register.fillFormAndRegister("tewr", "tedst",register.generateRandomEmail(),"Test1234!");
        
            desktops.clickCategory();
            desktops.clickCategorySubMenu();
            
            //Act
            desktops.addAllToCart();
            desktops.removeFromCart();
            
            //Checkout items from cart and validate checkout.
            desktops.checkoutAndValidate();
            
            //Fill in all required information for checkout and complete transaction.
            desktops.completeTransaction();
            
            //Navigate to my account and validate order is created successful.
            desktops.ValidateOrder();
        }
        
	@AfterMethod
	public void teardown() {
            driver.close();
	}

}
