package com.smartphone.tests.day_4;

import com.github.javafaker.Faker;
import com.smartphone.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class nameLocaterTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        Faker faker = new Faker();
        driver.findElement(By.name("full_name")).sendKeys(faker.name().firstName());
        driver.findElement(By.xpath("(//div/input)[2]")).sendKeys( faker.internet().emailAddress());
        driver.findElement(By.name("wooden_spoon")).click();
        driver.quit();

    }
}
