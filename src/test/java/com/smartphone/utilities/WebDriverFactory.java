package com.smartphone.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Locale;

public class WebDriverFactory {



   public static WebDriver getDriver(String browserType){
       WebDriver driver = null;
       switch (browserType.toLowerCase()){
           case "chrome":
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
           break;
           case "firefox":
               WebDriverManager.firefoxdriver().setup();
               driver=new FirefoxDriver();

       }
       return  driver;
   }


}
