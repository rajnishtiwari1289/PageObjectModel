package com.testinglab.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends  CommonPageHelper{

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailId;
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;
    @FindBy(xpath = "//button[@id='submit']")
    WebElement submitBtn;
    public HomePage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver,this);
    }
    public void enterEmailId(String email){
        emailId.sendKeys(email);
    }
    public void enterPassword(String pass){
        password.sendKeys(pass);
    }
    public void login(String email,String pass){
        enterEmailId(email);
        enterPassword(pass);
        submitBtn.click();
    }
}
