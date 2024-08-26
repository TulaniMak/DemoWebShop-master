/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qa.pages;

import com.qa.base.TestBase;
import static com.qa.base.TestBase.driver;
import java.util.UUID;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author Tulan
 */
public class WebShopRegister  extends TestBase{
    @FindBy(id="gender-male")
    private WebElement gender;
    
    @FindBy(id="FirstName")
    private WebElement firstname;
    
    @FindBy(id="LastName")
    private WebElement lastname;
    
    @FindBy(id="ConfirmPassword")
    private WebElement confirmPasswordbox;
    
    @FindBy(id="Email")
    private WebElement emailbox;
	
    @FindBy(id="Password")
    private WebElement passwordbox;
    
    @FindBy(id="register-button")
    private WebElement registerBtn;
    
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")
    private WebElement successfulRegisterMessage;
        
    public WebShopRegister(){
        PageFactory.initElements(driver, this);
    }
    
    public void fillFormAndRegister(String firstName, String lastName, String email, String password){
        this.gender.click();
        this.firstname.sendKeys(firstName);
        this.lastname.sendKeys(lastName);
        this.emailbox.sendKeys(email);
        this.passwordbox.sendKeys(password);
        this.confirmPasswordbox.sendKeys(password);
        this.registerBtn.click();
        
        String expectedMessage = "Your registration completed";
        String actualMessage = successfulRegisterMessage.getText().trim();
    }
    
    public String generateRandomEmail() {
        // Generate a unique identifier
        String uniqueID = UUID.randomUUID().toString();
        
        // Define the domain
        String domain = "example.com";
        
        // Create a random email address
        String email = uniqueID + "@"+ domain;
        
        return email;
    }
    
}
