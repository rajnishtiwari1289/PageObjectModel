package com.testinglab.unit;

import com.testinglab.config.GlobalHelper;
import com.testinglab.drivers.Driver;
import com.testinglab.pageObjects.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    @BeforeClass
    public void setup(){

        GlobalHelper.loadProperty();
    }
    @BeforeMethod
    public  void beforeMethod(){
        driver=new Driver().getDriverObject("chrome");
    }
    @Test
    public  void login(){
        HomePage homePage= new HomePage(this.driver);
        driver.get(GlobalHelper.getProperty("homePageURI"));
        homePage.login(GlobalHelper.getProperty("username"),GlobalHelper.getProperty("password"));
    }
    @AfterMethod
    public  void  afterMethod(){
        driver.quit();
    }

}
