package com.ashwin.framework.pages;
import org.openqa.selenium.By;

/*
 implementation without page factory
*/

import org.openqa.selenium.WebDriver;

public class LoginPage {

    public WebDriver driver ;

   public  LoginPage(WebDriver driver){
        this.driver = driver ;

    }

    // Locators


    By search_bar =  By.xpath("//input[@id='search_bar_id']") ;
    By search_button = By.xpath("//img[@alt='Search']") ;


    //Methods

    public void searchProducts(String productname){
        driver.findElement(search_bar).sendKeys(productname);

    }

    public void clickSearchButton(){
        driver.findElement(search_button).click();

    }



}
