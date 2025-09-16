package com.example.demoqa.pages;

import org.openqa.selenium.By;

import com.example.demoqa.pages.forms.FormsPage;
import com.saucedemo.pages.BasePage;

public class HomePage  extends BasePage{
    
private By formsCard=By.xpath("//div[@id='app']//h5[text()='Form']");


public FormsPage goToForms(){

    click(formsCard);
    return new FormsPage();
}
}
                 