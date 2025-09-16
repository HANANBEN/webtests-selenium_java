
package com.example.part2.tests.products;

import static org.junit.Assert.*;

import org.junit.Test;
import org.testng.Assert;

import com.example.part1.ProductPage;
import com.example.part2.base.BaseTest;

public class ProductTest extends BaseTest{
    
    


    @Test
    public void testProductsHeaderIsDisplayed(){

        ProductPage productPage=loginPage.loginIntoApplication("standard_user", "secret_sauce"); 

        Assert.assertTrue(productPage.isProductsHeaderDisplayed());

}
}
