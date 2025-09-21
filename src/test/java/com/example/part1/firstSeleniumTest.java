package com.example.part1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import junit.framework.Assert;


public class firstSeleniumTest {


    static WebDriver driver;

    // the goal of a web driver is to controle the browser and help fon the elements 
     @BeforeClass
     public static void setUp(){
      ChromeOptions options = new ChromeOptions();
options.addArguments("--headless");            // run without UI
options.addArguments("--no-sandbox");          // required in CI
options.addArguments("--disable-dev-shm-usage"); // avoid memory issues
 driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 

     }
    


     @AfterClass
      public static void tearDown(){
          //  driver.quit();
      }

      @Test 
      public void testLoggingIntoApplication() throws InterruptedException{


        Thread.sleep(2000);

        /**
         * 1. find an element 
         * 2. perform actionon an element 
         * 
         * BY is A CLASS that is used to locate elements by selenium locators :
         * 4 locators in selenium  :
         * By.className : 
         * By.cssSelector :
         * By.id :
         * By.linkText :
         * By.name
         * By.partialLinkTest
         * By.tagName 
         * By.xpath
         */
        WebElement username = driver.findElement(By.name("username")); 

        username.sendKeys("admin");



        var password = driver.findElement(By.name("password")); 

        password.sendKeys("admin123");
         
        // we checked our dom , and we find out that one button exist , so we can select the button using a tag name which is "button"
        driver.findElement(By.tagName("button") ).click();
        

        Thread.sleep(4000);
        
        String actualResult =driver.findElement(By.tagName("h6")).getText();

        Assert.assertEquals("Dashboard" , actualResult);

      }

/**
 * page object modele design pattern :
 * 
 *  code reusability : reuse code in multiple locations in our program 
 * 
 *  code readability : code is easy to follow
 * 
 *  code maintanability : take less time to make a change to our code 
 *  
 */

   
}

