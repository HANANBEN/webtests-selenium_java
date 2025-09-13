package com.example.part1;

import org.openqa.selenium.By;

import com.saucedemo.pages.BasePage;

public class ProductPage extends BasePage {

    private By productHeader= By.xpath("//span[text()='Products']");
    
    public boolean isProductsHeaderDisplayed() {

        return find(productHeader).isDisplayed();
    }


    /*
     * if you have webDriver Apis in your test methods then you are doing it wrong  --simon Stewart.
     */

     /*
      * 
      i prefer to include assertion in my test scripts and not the base page or page object class
      */
}
