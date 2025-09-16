package com.example.part1;

import org.openqa.selenium.By;

import com.saucedemo.pages.BasePage;

public class LoginPage extends BasePage {
    
    private By usernameField = By.id("user-name");
    private By passwordField= By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage= By.cssSelector("#login_button_container h3");
    


    /*
     * they are 4 types of method that you can use in you page object class : 
     * => 1. getter methods
     * => 2. setter methods 
     * => 3.transition methonds 
     * => 4.convenience methods 
     */
    public void setUsername(String username){
           setInput(usernameField , username);
    }
    
    
    public void setPassword(String  password){
           setInput(passwordField , password);
    }


    //transition methods
    public ProductPage clickLogin(){
        click(loginButton);
       return  new ProductPage();
    }

    public ProductPage loginIntoApplication(String username, String password){
        setUsername(username);
        setPassword(password);
        return clickLogin();
    }

    public String getErrorMessage(){
        return find(errorMessage).getText();
    }
  //transition methods is important when our application is changed to another page 
  //convenience method is used when combining more than one method into a single method 
    
}
          