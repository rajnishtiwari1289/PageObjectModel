package com.testinglab.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public enum DriverType implements DriverRule{
    CHROME  {
        public WebDriver getDriver(){
            WebDriver driver= new ChromeDriver();
            driver.manage().window().fullscreen();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            return driver;
        }
    },
    EDGE  {
        public WebDriver getDriver(){
            WebDriver driver= new EdgeDriver();
            return driver;
        }
    }

}
