package com.testinglab.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactDetailsPage extends CommonPageHelper {

    @FindBy(xpath = "//button[@id='edit-contact']")
    WebElement editContactBtn;
    @FindBy(xpath = "//button[@id='return']")
    WebElement returnToListBtn;
    @FindBy(xpath = "//button[@id='delete']")
    WebElement deleteBtn;
    public ContactDetailsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public  void clickOnEditContactBtn(){
        editContactBtn.click();
    }
    public  void clickOnReturnBtn(){
        returnToListBtn.click();
    }
    public  void clickOnDeleteBtn(){
        deleteBtn.click();
        driver.switchTo().alert().accept();
    }
}
