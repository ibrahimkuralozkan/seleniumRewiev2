package com.smartphone.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

    public static void main(String[] args) {

   WebDriverManager.chromedriver().setup();
   WebDriver driver = new ChromeDriver();
   driver.get("https://www.tr724.com");

   WebDriverManager.firefoxdriver().setup();
   WebDriver driver1 = new FirefoxDriver();
        driver1.get("https://www.tr724.com");


        WebDriverManager.edgedriver().setup();
        WebDriver driver2 = new EdgeDriver();
        driver2.get("https://www.tr724.com");







    }






}
