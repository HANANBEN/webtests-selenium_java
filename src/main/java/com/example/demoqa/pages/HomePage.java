package com.example.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static com.example.utilities.JavaScriptUtility.scrollToElementJS;
import com.example.demoqa.pages.forms.FormsPage;
import com.saucedemo.pages.BasePage;

public class HomePage  extends BasePage{

    protected WebDriver driver;
    
private By formsCard=By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div//div[3]/child::h5[text()='Forms']");


public FormsPage goToForms(){
    

    scrollToElementJS(formsCard);
    click(formsCard);
    return new FormsPage();
}

 public HomePage(WebDriver driver) {
        this.driver = driver;  // store the driver
    }

}
                 