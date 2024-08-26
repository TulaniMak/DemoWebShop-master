package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.qa.base.TestBase;
import org.openqa.selenium.support.ui.Select;


public class WebShopDesktops extends TestBase{        
        @FindBy (linkText = "Computers")
        private WebElement category;
        
        @FindBy (linkText = "Desktops")
        private WebElement categorySubmenu;
       
        @FindBy (id="products-orderby")
        private WebElement sortBy;
        
        @FindBy (id="product_attribute_75_5_31_96")
        private WebElement selectProcessor;
       
        @FindBy (xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")
        private WebElement firstDesktop;
               
        @FindBy (xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/div[3]/div[2]/input")
        private WebElement secondDesktop;
        
        @FindBy (xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/div[3]/div[2]/input")
        private WebElement thirdDesktop;
        
        @FindBy (xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[6]/div/div[2]/div[3]/div[2]/input")
        private WebElement forthDesktop;
        
        @FindBy (id = "add-to-cart-button-72")
        private WebElement addFirstToCart;
        
        @FindBy (id = "add-to-cart-button-16")
        private WebElement addSecondToCart;
        
        @FindBy (id="product_attribute_16_3_6_18")
        private WebElement selectHHD;
        
        @FindBy (id = "add-to-cart-button-74")
        private WebElement addThirdToCart;
        
        @FindBy (id = "add-to-cart-button-75")
        private WebElement addForthToCart;
        
        @FindBy (linkText = "Shopping cart")
        private WebElement gotocart;
        
        @FindBy (xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[2]/div[1]/table/tbody/tr[4]/td[2]/span/span/strong")
        private WebElement total;
        
        @FindBy (xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[1]/td[1]/input")
        private WebElement selectItemToRemove;
        
        @FindBy (xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[1]/div/input[1]")
        private WebElement updateCart;
        
        @FindBy (id = "CountryId")
        private WebElement selectCountry;
        
        @FindBy (id = "termsofservice")
        private WebElement termsofservice;
        
        @FindBy (id = "checkout")
        private WebElement checkout;
        
        @FindBy (id="BillingNewAddress_City")
        private WebElement BillingNewAddress_City;
        
        @FindBy (id="BillingNewAddress_Address1")
        private WebElement BillingNewAddress_Address1;
        
        @FindBy (id="BillingNewAddress_ZipPostalCode")
        private WebElement BillingNewAddress_ZipPostalCode;
	
        @FindBy (id="BillingNewAddress_PhoneNumber")
        private WebElement BillingNewAddress_PhoneNumber;
        
        @FindBy (id="BillingNewAddress_CountryId")
        private WebElement BillingNewAddress_CountryId;
        
        @FindBy (xpath = "//*[@id=\"billing-buttons-container\"]/input") 
        private WebElement continueBillingBtn; 
        
        @FindBy (xpath = "//*[@id=\"shipping-buttons-container\"]/input")
        private WebElement continueShippingBtn; 
        
        @FindBy (xpath = "//*[@id=\"shipping-method-buttons-container\"]/input")
        private WebElement continueShippingMethodBtn; 
        
        @FindBy (xpath = "//*[@id=\"payment-method-buttons-container\"]/input")
        private WebElement continuePaymentMethodBtn; 
        
        @FindBy (xpath = "//*[@id=\"payment-info-buttons-container\"]/input")
        private WebElement continuePaymentInfoBtn; 
        
        @FindBy (xpath = "//*[@id=\"confirm-order-buttons-container\"]/input")
        private WebElement confirmOrderBtn; 
        
        @FindBy (xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[1]/strong")
        private WebElement successMessage; 
        
        @FindBy (xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/h1")
        private WebElement computerTitle; 
        
        @FindBy (xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/h1")
        private WebElement desktopTitle; 
        
	public WebShopDesktops() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}
        
        public void clickCategory(){
            category.click();
            Assert.assertEquals(computerTitle.getText().trim(), "Computers");
        }
        
        public void clickCategorySubMenu(){
            categorySubmenu.click();
            Assert.assertEquals(desktopTitle.getText().trim(), "Desktops");
        }
        
        public void sortByAll(){
            
        }
        
        public void addAllToCart(){
            try {
                firstDesktop.click();
                addFirstToCart.click();
                 Thread.sleep(5000);
                
                categorySubmenu.click();
                                    
                secondDesktop.click();
                selectHHD.click();
                addSecondToCart.click();
                 Thread.sleep(5000);
               
                categorySubmenu.click();
                

                thirdDesktop.click();
                addThirdToCart.click();
                 Thread.sleep(5000);
               
                categorySubmenu.click();
                

                forthDesktop.click();
                selectProcessor.click();
                addForthToCart.click();
                Thread.sleep(5000);
                
                gotToCart();
                String actual = total.getText().trim();
                String expected = "4695.00";
                
                Assert.assertEquals(actual, expected);
                //validate total
               
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        public void gotToCart(){
            gotocart.click();
        }
        
        public void removeFromCart(){
             gotToCart();
             selectItemToRemove.click();
             updateCart.click();
             
        }

    public void checkoutAndValidate() {
        Select dropdown = new Select(selectCountry);
        dropdown.selectByIndex(1); 
        termsofservice.click(); 
        checkout.click();
    }

    public void completeTransaction() {
        filladdress();
        //Shipping address
        continueShippingBtn.click();
        
        //Shipping method 
        continueShippingMethodBtn.click();
        
        //payment method
        continuePaymentMethodBtn.click();
        
        //payment information
        continuePaymentInfoBtn.click();
        
        //Confirm order
        confirmOrderBtn.click();
        
    }

    private void filladdress() {
        Select dropdown = new Select(BillingNewAddress_CountryId);
        dropdown.selectByIndex(1); 
        BillingNewAddress_City.sendKeys("test");
        BillingNewAddress_Address1.sendKeys("test");
        BillingNewAddress_ZipPostalCode.sendKeys("4325");
        BillingNewAddress_PhoneNumber.sendKeys("0816772234");
        
        continueBillingBtn.click();
    }

    public void ValidateOrder() {
        String expected = "Your order has been successfully processed!";
        String actual = successMessage.getText().trim();
        Assert.assertEquals(actual, expected);
    }
}
