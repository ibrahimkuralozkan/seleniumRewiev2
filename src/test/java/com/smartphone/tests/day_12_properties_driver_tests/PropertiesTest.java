package com.smartphone.tests.day_12_properties_driver_tests;

import com.smartphone.utilities.ConfigurationReader;
import com.smartphone.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.security.Key;

public class PropertiesTest {
    WebDriver driver;
    @AfterMethod
     public void teardrop(){

        driver.quit();
    }
    @Test
    public void test1(){
         driver = WebDriverFactory.getDriver(ConfigurationReader.get("browser"));
        String browser = ConfigurationReader.get("browser");
        driver.get(ConfigurationReader.get("url"));
        driver.findElement(By.id("prependedInput")).sendKeys(ConfigurationReader.get("driver_username"));
        driver.findElement(By.id("prependedInput2")).sendKeys(ConfigurationReader.get("driver_password")+ Keys.ENTER);


    }




}
