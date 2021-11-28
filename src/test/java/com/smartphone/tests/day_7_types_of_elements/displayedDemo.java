package com.smartphone.tests.day_7_types_of_elements;

import com.smartphone.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class displayedDemo {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement username= driver.findElement(By.cssSelector("#username"));



        Assert.assertTrue(username.isEnabled());

        WebElement start =driver.findElement(By.cssSelector("#start > button"));
        start.click();
        Thread.sleep(6000);
        Assert.assertTrue(username.isDisplayed());

       driver.quit();
    }
}