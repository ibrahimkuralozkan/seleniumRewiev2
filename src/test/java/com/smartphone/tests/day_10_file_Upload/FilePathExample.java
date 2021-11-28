package com.smartphone.tests.day_10_file_Upload;

import com.smartphone.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FilePathExample {

    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("firefox");
    }

    @AfterMethod
    public void TearDown() {
        driver.quit();
    }

    @Test
    public void pathFinder() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/upload");
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.dir"));
        String prjectpath = System.getProperty("user.dir");
        String filepath="src/test/resources/textfile.txt";
        System.out.println(prjectpath+"+"+filepath);
        String fullpath= prjectpath+"/"+filepath;
        System.out.println(fullpath); driver.get("http://practice.cybertekschool.com/upload");
        WebElement choosefile = driver.findElement(By.id("file-upload"));
        choosefile.sendKeys(fullpath);
        Thread.sleep(2000);
        WebElement submit = driver.findElement(By.id("file-submit"));
        submit.click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#content > div > h3")).isDisplayed());
        Thread.sleep(2000);


    }


}
