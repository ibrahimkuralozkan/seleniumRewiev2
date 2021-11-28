package com.smartphone.tests.day_11_Web_Tables;

import com.smartphone.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class WebTablesExample {

    WebDriver driver;

    @BeforeMethod

    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/tables");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();

    }

    @Test
    public void test1() {

        WebElement table1 = driver.findElement(By.id("table1"));
        System.out.println(table1.getText());
    }


    @Test
    public void getALlHeaders() {
        WebElement table1 = driver.findElement(By.id("table1"));
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("headers.size() = " + headers.size());
        for (WebElement header : headers) {
            System.out.println(header.getText());
        }


    }

    @Test
    public void getALlcolumns() {

        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='table1']//tr[2]"));
        System.out.println("columns.size() = " + columns.size());

        for (WebElement column:columns
             ) {
            System.out.println(column.getText());
        }

    }}