package com.example.utilities;

import org.openqa.selenium.WebDriver;

import com.saucedemo.pages.BasePage;

public class Utility {

    public static WebDriver driver; 
    

    public static void setUtilityDriver(){
        driver= BasePage.driver;
    }
    
}
