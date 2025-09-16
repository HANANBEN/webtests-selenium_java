package com.example.part2.tests.login;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.example.part2.base.BaseTest;


public class loginTest extends BaseTest{



    @Test
    public void  testLoginErrorMessage(){
        
        loginPage.setUsername("standard_user"); 
        loginPage.setPassword("1234");
        loginPage.clickLogin();
        String actualMessage=loginPage.getErrorMessage();
        Assert.assertTrue(actualMessage.contains("Epic sadface"));
        
    }

    
}
