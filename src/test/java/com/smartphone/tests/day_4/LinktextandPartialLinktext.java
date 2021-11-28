package com.smartphone.tests.day_4;

import com.smartphone.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinktextandPartialLinktext {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        //driver.findElement(By.linkText("Example 1: Element on page that is hidden and become visible after trigger")).click();
        driver.findElement(By.partialLinkText("Example 4:")).click();



    }
}
