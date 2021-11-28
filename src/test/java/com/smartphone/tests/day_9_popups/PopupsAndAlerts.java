package com.smartphone.tests.day_9_popups;

import com.smartphone.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PopupsAndAlerts {


    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        WebElement jsalert = driver.findElement(By.xpath("//*[@id='content']/div/button[1]"));
        jsalert.click();

        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement jsconfirm = driver.findElement(By.xpath("//button[2]"));
        jsconfirm.click();
        Thread.sleep(2000);
        alert.dismiss();


        WebElement jsprompt = driver.findElement(By.xpath("//button[3]"));
        jsprompt.click();
        alert.sendKeys("vyxcvxcvvyvxcvyxcvyxcvyxvcyvy");
        alert.accept();
        Thread.sleep(2000);


        driver.quit();

    }



}
