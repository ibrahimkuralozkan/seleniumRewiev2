package com.smartphone.tests.day_4;

import com.smartphone.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
       driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/button[3]")).click();

       driver.quit();
    }
}
