package com.example.part2.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.example.part1.LoginPage;
import com.example.part1.ProductPage;
import com.saucedemo.pages.BasePage;

public class BaseTest {

    protected WebDriver driver; 
    protected BasePage basePage; 
    protected LoginPage loginPage;
      protected ProductPage productPage;
    private String url= "https://www.saucedemo.com"; 




    /*
     * 🔹 In JUnit (JUnit 4)

@BeforeClass

Runs once before any test methods in the class.

Must be static.

Typically used to set up expensive resources (e.g., DB connection, server startup).

@AfterClass

Runs once after all test methods in the class.

Must be static.

Typically used for cleanup (e.g., close DB connection, stop server).
=============> JUnit 5 replacement
@BeforeAll/@AfterAl

🔹 In TestNG

@BeforeClass

Runs once before the first test method in the current class.

Does not need to be static.

Good for class-level setup.

@AfterClass

Runs once after all test methods in the current class.

Does not need to be static.

Good for cleanup at class level.

     */

    @BeforeClass
    public void setUp() {
        driver= new ChromeDriver(); 

        driver.manage().window().maximize();
        driver.get(url);

        basePage = new BasePage();
        basePage.setDriver(driver);
        loginPage = new LoginPage();       
    }
  

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
