
# DemoWebShop Automation Project

This project automates the testing of the [DemoWebShop](https://demowebshop.tricentis.com/) website using Selenium, TestNG, and Maven. The automation framework follows the Page Object Model (POM) design pattern.

## Project Structure

```bash
/src
  /main
    /java
      /com/qa/pages     # Page Object Model classes
      /com/qa/base # Utility classes (e.g., WebDriver setup)
      /com/qa/config    #Browser and URL
  /test
    /java
      /com/qa/tests     # Test classes
/pom.xml                        # Maven Project Object Model file


## **Prerequisites**

1. Java Development Kit (JDK) installed.
   
2. Selenium WebDriver configured in the project.
   
3. TestNG framework set up for running test suites.
   
4. WebDriver for the browser under test (e.g., ChromeDriver, FirefoxDriver).


## **Tecnologies and Tools:** 

- Selenium WebDriver
  
- TestNG
  
- JUnit (for test execution and assertions)
  
- WebDriverManager (for managing browser drivers)


## **Getting Started**

To run the tests locally, follow these steps:

1. Clone the repository to your local machine:
  
2. Set up the necessary dependencies in the project, including Selenium WebDriver and TestNG.
    
3. Configure WebDriver for the desired browser (e.g., ChromeDriver, FirefoxDriver).
   
4. Update the test scripts in the project to reflect the specific test scenarios and requirements.

## **Test Scenarios**
The automation suite covers the following scenarios:

1. User Registration
    Navigate to the website and register a new user.
2. User Login
    Log in with existing user.
3. Product Selection and Cart Operations
    Navigate to the Computers tab and select the Desktops option.
    Sort desktops by all available options.
    Add all desktop items to the cart and validate the total price.
    Remove one item from the cart and validate the updated total price.
4. Checkout Process
    Checkout items from the cart and validate the checkout process.
    Fill in all required information for checkout and complete the transaction.
5. Order Validation
    Navigate to the user's account and validate that the order was created successfully.
