package com.example.part3_4.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import static com.example.utilities.Utility.setUtilityDriver;


import com.example.demoqa.pages.HomePage;
import com.saucedemo.pages.BasePage;

public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage; 
    protected HomePage homePage; 
    private String DEMOQA_URL= "https://demoqa.com/"; 


    @BeforeClass
    public void setUp(){
        driver= new ChromeDriver(); 
        driver.manage().window().maximize();
        
    }

    /*
     * @BeforeMethod / @AfterMethod

        Run **before and after EACH test method in the class.

        Good for resetting state, preparing test data, cleaning up after each test, etc
     */

    @BeforeMethod
    public void loadApplication(){
        driver.get(DEMOQA_URL);
        basePage=new BasePage(); 
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage= new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    
    
}
