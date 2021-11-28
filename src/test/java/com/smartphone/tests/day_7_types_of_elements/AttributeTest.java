package com.smartphone.tests.day_7_types_of_elements;

import com.smartphone.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AttributeTest {
    @Test
    public void test1(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement blue= driver.findElement(By.name("button2"));

        System.out.println(blue.getText());
        System.out.println(blue.getAttribute("type"));
        System.out.println(blue.getAttribute("innerHTML"));
        driver.quit();
    }


}
