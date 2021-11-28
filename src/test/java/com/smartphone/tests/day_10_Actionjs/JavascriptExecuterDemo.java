package com.smartphone.tests.day_10_Actionjs;

import com.smartphone.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavascriptExecuterDemo {

    WebDriver driver;


    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void TearDown() {
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {


        WebElement dropdown = driver.findElement(By.linkText("Dropdown"));
        JavascriptExecutor javascriptExecutor =( JavascriptExecutor) driver;

    }

@Test
    public void typeWithJs() throws InterruptedException {
    driver.get("http://practice.cybertekschool.com");
    WebElement dropdown = driver.findElement(By.linkText("Dropdown"));

    JavascriptExecutor javascriptExecutor =( JavascriptExecutor) driver;

    javascriptExecutor.executeScript("arguments[0].click",dropdown);
    driver.get("http://practice.cybertekschool.com/dynamic_controls");


    WebElement inputbox = driver.findElement(By.cssSelector("#input-example > input[type=text]"));
    String text = "Kara kelle";
    javascriptExecutor.executeScript("arguments[0].setAttribute('value', '"+text +"')",inputbox);
    Thread.sleep(3000);





}

@Test
    public void scrollDownAndUp
        () throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/infinite_scroll");
        JavascriptExecutor jse = (JavascriptExecutor) driver;

    for (int i = 0; i < 10; i++) {
        jse.executeScript("window.scrollBy(0,250)");
        Thread.sleep(1000);
    }

    for (int i = 0; i < 10; i++) {
        jse.executeScript("window.scrollBy(0,-250)");
        Thread.sleep(1000);
    }



}





}