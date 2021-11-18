package com.smartphone.tests.day_3;

import com.github.javafaker.Faker;
import com.smartphone.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyurlchanged {
    public static void main(String[] args) {
        Faker faker = new Faker();

        WebDriver driver =WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        String url1=driver.getCurrentUrl();
        WebElement email= driver.findElement(By.xpath("//*[@id='forgot_password']/div/div/input"));
        email.sendKeys(faker.internet().emailAddress());
        driver.findElement(By.xpath("//*[@id='form_submit']/i")).click();

        String url2=driver.getCurrentUrl();

        if (url1.equals(url2)){

            System.out.println("Didint Chnaged");


        }else {
            System.out.println("changed");
        }
            driver.quit();




    }



}
