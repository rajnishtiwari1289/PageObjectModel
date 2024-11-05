package com.testinglab.pageObjects;

import org.openqa.selenium.WebDriver;

public class ObjectManager {


    private HomePage homePage;
    private EditContactPage editContactPage;
    private ContactListPage contactListPage;
    private ContactDetailsPage contactDetailsPage;
    private AddContactPage addContactPage;
    private WebDriver driver;

    public ObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage(driver);
        }
        return homePage;
    }

    public EditContactPage getEditContactPage() {
        if (editContactPage == null) {
            editContactPage = new EditContactPage(driver);
        }
        return editContactPage;
    }

    public ContactListPage getContactListPage() {
        if (contactListPage == null) {
            contactListPage = new ContactListPage(driver);
        }
        return contactListPage;
    }

    public ContactDetailsPage getContactDetailsPage() {
        if (contactDetailsPage == null) {
            contactDetailsPage = new ContactDetailsPage(driver);
        }
        return contactDetailsPage;
    }

    public AddContactPage getAddContactPage() {
        if (addContactPage == null) {
            addContactPage = new AddContactPage(driver);
        }
        return addContactPage;
    }
}
