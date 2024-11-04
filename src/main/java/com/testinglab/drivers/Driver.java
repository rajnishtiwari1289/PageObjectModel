package com.testinglab.drivers;

import org.openqa.selenium.WebDriver;

public class Driver {
  public WebDriver getDriverObject(String browser){
     return DriverType.valueOf(browser.toUpperCase()).getDriver();
  }
}
