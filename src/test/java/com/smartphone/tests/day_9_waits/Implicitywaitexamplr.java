package com.smartphone.tests.day_9_waits;

import com.smartphone.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Implicitywaitexamplr {



    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = WebDriverFactory.getDriver("Chrome");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {

        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        WebElement start = driver.findElement(By.cssSelector("#start > button"));
        start.click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#username"))));
        driver.findElement(By.id("username")).sendKeys("Kara Kelle");

    }




    @Test
    public void test2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        driver.findElement(By.xpath("//*[@id='input-example']/button")).click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement inputexample = driver.findElement(By.cssSelector("#input-example > input[type=text]"));
        wait.until(ExpectedConditions.elementToBeClickable(inputexample));
        inputexample.sendKeys("Kara kelle");


    }





}




