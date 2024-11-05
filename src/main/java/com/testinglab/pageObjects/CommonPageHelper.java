package com.testinglab.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPageHelper {
    @FindBy(xpath = "//button[@id='logout']")
    WebElement logoutbtn;
    WebDriver driver;
    CommonPageHelper(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void logout(){
        logoutbtn.click();
    }
}
