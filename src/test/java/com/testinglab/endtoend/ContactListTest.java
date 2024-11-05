package com.testinglab.endtoend;

import com.testinglab.config.GlobalHelper;
import com.testinglab.drivers.Driver;
import com.testinglab.pageObjects.HomePage;
import com.testinglab.pageObjects.ObjectManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

public class ContactListTest {
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
    public  void addContactAndDisplay(){
        ObjectManager objectManager= new ObjectManager(this.driver);
        driver.get(GlobalHelper.getProperty("homePageURI"));
        objectManager.getHomePage().login(GlobalHelper.getProperty("username"),GlobalHelper.getProperty("password"));
        objectManager.getContactListPage().clickOnAddNewContactBtn();
        HashMap<String, String> contactData= new HashMap<>();
        contactData.put("fName","rajnish1");
        contactData.put("lName","tiwari1");
        contactData.put("phone","2123456789");
        contactData.put("street1","street1 address");
        contactData.put("city","indore");
        objectManager.getAddContactPage().addContact(contactData);
        objectManager.getContactListPage().getContacts();
    }

    @AfterMethod
    public  void  afterMethod(){
        driver.quit();
    }
}
