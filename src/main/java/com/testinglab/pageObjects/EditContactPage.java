package com.testinglab.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditContactPage extends CommonPageHelper {
    @FindBy(xpath = "//input[@id='firstName']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='lastName']")
    WebElement lastName;
    @FindBy(xpath = "//input[@id='phone']")
    WebElement phone;
    @FindBy(xpath = "//input[@id='street1']")
    WebElement street1;
    @FindBy(xpath = "//input[@id='city']")
    WebElement city;
    @FindBy(xpath = "//button[@id='submit']")
    WebElement submitbtn;
    @FindBy(xpath = "//button[@id='cancel']")
    WebElement cancelbtn;

    public EditContactPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
