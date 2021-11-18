package com.smartphone.tests.day_3;

import com.smartphone.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyUrlNotChanged {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        String currentUrl = driver.getCurrentUrl();

        WebElement retrieve = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));
        retrieve.click();

        String currentUrl1 = driver.getCurrentUrl();
        System.out.println("currentUrl1 = " + currentUrl1);
        System.out.println("currentUrl = " + currentUrl);

        if (currentUrl1.equals(currentUrl)){
            System.out.println("same");
        }else
            System.out.println("Diffrent");


        driver.quit();


    }

}
