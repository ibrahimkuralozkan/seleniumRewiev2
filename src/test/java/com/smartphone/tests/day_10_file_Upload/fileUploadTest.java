package com.smartphone.tests.day_10_file_Upload;

import com.smartphone.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class fileUploadTest {
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
   public void fileUpload() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/upload");
       WebElement choosefile = driver.findElement(By.id("file-upload"));
       choosefile.sendKeys("C:\\Users\\inter\\OneDrive\\Masaüstü\\file.txt");
       Thread.sleep(2000);
       WebElement submit = driver.findElement(By.id("file-submit"));
       submit.click();
       Assert.assertTrue(driver.findElement(By.cssSelector("#content > div > h3")).isDisplayed());
       Thread.sleep(2000);


   }











}
