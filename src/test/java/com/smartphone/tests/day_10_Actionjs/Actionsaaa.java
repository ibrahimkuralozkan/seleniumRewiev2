package com.smartphone.tests.day_10_Actionjs;

import com.smartphone.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Actionsaaa {

    WebDriver driver;




    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void TearDown(){
       driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/hovers");
        WebElement webElement1 = driver.findElement(By.tagName("img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(webElement1).perform();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.linkText("View profile")).isDisplayed());
        actions.moveToElement(driver.findElement(By.xpath("(//img)[2]"))).perform();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.linkText("View profile")).isDisplayed());
        actions.moveToElement(driver.findElement(By.xpath("(//img)[3]"))).perform();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.linkText("View profile")).isDisplayed());

}
    @Test
    public void dragANdDrop() throws InterruptedException {

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        WebElement button= driver.findElement(By.cssSelector("button#onetrust-accept-btn-handler"));
        button.click();
        Thread.sleep(2000);
        WebElement small = driver.findElement(By.id("draggable"));
        WebElement big=driver.findElement(By.id("droptarget"));
        actions.dragAndDrop(small,big).perform();
        Thread.sleep(1000);


}
    @Test
    public void test4() throws InterruptedException {


        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        WebElement button= driver.findElement(By.cssSelector("button#onetrust-accept-btn-handler"));
        button.click();
        Thread.sleep(2000);
        WebElement small = driver.findElement(By.id("draggable"));
        WebElement big=driver.findElement(By.id("droptarget"));
        actions.moveToElement(small).clickAndHold().moveToElement(big).release().perform();
        Thread.sleep(4000);


    }

}