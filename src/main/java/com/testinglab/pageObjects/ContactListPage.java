package com.testinglab.pageObjects;

import net.bytebuddy.implementation.bind.annotation.Super;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactListPage extends CommonPageHelper {

    @FindBy(xpath = "//button[@id='add-contact']")
    WebElement addNewContactBtn;

    public ContactListPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnContact(String contactName) {
        WebElement contactNameEle = driver.findElement(By.xpath("//td[contains(text()," + contactName.toUpperCase() + ")]"));
        if (contactNameEle != null)
            contactNameEle.click();
    }

    public void clickOnAddNewContactBtn() {
        addNewContactBtn.click();
    }

    public void getContacts() {
        String xpath = "//tr[1]/td";
        List<WebElement> contactList = driver.findElements(By.xpath("//tr"));
        for (int i = 1; i < contactList.size(); i++) {
            List<WebElement> elementList = driver.findElements(By.xpath("//tr[" + i + "]/td"));
            for (WebElement element : elementList)
                System.out.print(element.getText() +"   |");

            System.out.println("");
        }

    }
}
