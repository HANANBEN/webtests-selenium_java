package com.example.part1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstSeleniumTest {


    WebDriver driver;

    // the goal of a web driver is to controle the browser and help fon the elements 
     @BeforeClass
     public void setUp(){
        driver = new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 

     }
    


     @AfterClass
      public void tearDown(){
           driver.quit();
      }

      @Test 
      public void testLoggingIntoApplication(){
        driver.findElement(By.)
      }



}

