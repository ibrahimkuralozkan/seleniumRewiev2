package com.smartphone.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigattionDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tr724.com");
        driver.navigate().to("https://www.google.com");

        driver.navigate().back();

        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();

    }

}
