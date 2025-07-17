package com.ashwin.framework.base;
import com.ashwin.framework.utils.ConfigReader;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected WebDriver driver ;


    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
      //  driver.get(ConfigReader.getValue("baseurl")) ;

    }


    @AfterMethod

    public void teardown(){
        if (driver != null) {
            driver.quit();
        }


    }
}
