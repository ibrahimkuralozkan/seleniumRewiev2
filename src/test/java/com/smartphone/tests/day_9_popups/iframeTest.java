package com.smartphone.tests.day_9_popups;

import com.smartphone.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class iframeTest {

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
        driver.get("http://practice.cybertekschool.com/frames");
        WebElement link = driver.findElement(By.linkText("iFrame"));
        link.click();

        Thread.sleep(2000);

        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.cssSelector("#tinymce")).sendKeys("Kara kelle");

        Thread.sleep(2000);

        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        driver.findElement(By.cssSelector("#tinymce")).sendKeys("Kara kelle 22");
        driver.switchTo().parentFrame();
        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        driver.findElement(By.cssSelector("#tinymce")).sendKeys("Kara kelle   33  ");


    }
    @Test
    public void test2(){

        driver.get("http://practice.cybertekschool.com/frames");

        WebElement link = driver.findElement(By.linkText("Nested Frames"));
        link.click();




    }


}