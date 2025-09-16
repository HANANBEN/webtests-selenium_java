package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/* the base page has one role which is : to be a PARENT to all page classes *
 * abstract : because it should contains class members that is necessary in the child members 
 *     so we can not initiate it 
*/
public class BasePage {
  
 
    public static WebDriver driver; 

    public void setDriver(WebDriver driver ) {
        BasePage.driver=driver;
    }
    protected WebElement find(By locator){
          return driver.findElement(locator); 
    }


    protected void setInput(By locator , String text){
        find(locator).clear();
        find(locator).sendKeys(text);

    }
    protected void click(By locator){
        find(locator).click();
    }

}
