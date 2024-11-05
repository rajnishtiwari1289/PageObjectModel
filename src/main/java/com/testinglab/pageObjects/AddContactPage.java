package com.testinglab.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;

public class AddContactPage extends CommonPageHelper {

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

    public AddContactPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void addContact(HashMap<String, String> contactData) {
        if (contactData.get("fName") != null)
            firstName.sendKeys(contactData.get("fName"));
        if (contactData.get("lName") != null)
            lastName.sendKeys(contactData.get("lName"));
        if (contactData.get("phone") != null)
            phone.sendKeys(contactData.get("phone"));
        if (contactData.get("street1") != null)
            street1.sendKeys(contactData.get("street1"));
        if (contactData.get("city") != null)
            city.sendKeys(contactData.get("city"));
        submitbtn.click();
    }




}
