package com.smartphone.tests.day_5;

import com.smartphone.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.SplittableRandom;

public class hw1 {
    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        driver.get("https://www.ebay.com/");
//        driver.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys("book");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id='gdpr-banner-accept']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id='gh-btn']")).click();
//        String count =driver.findElement(By.cssSelector(".srp-controls__count-heading>span")).getText();
//        String objectname = driver.findElement(By.cssSelector(".srp-controls__count-heading > span:nth-child(2)")).getText();
//        System.out.println(count+" results for "+objectname);
//        Thread.sleep(2000);
//        driver.quit();


//        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        driver.get("https://www.ebay.com/");
//        driver.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys("selenium");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id='gdpr-banner-accept']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id='gh-btn']")).click();
//
//        String tirle= driver.getTitle();
//        System.out.println(tirle);
//
//        if (tirle.contains("selenium")){
//
//            System.out.println("Contains");
//
//        }
//        else
//            System.out.println("Doesnt contain");
//
//        driver.quit();



//        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        driver.get("https://www.wikipedia.org");
//        driver.findElement(By.cssSelector("#js-link-box-en > strong:nth-child(1)")).click();
//        driver.findElement(By.xpath("//*[@id='searchInput']")).sendKeys("Selenium (software)");
//        driver.findElement(By.xpath("//*[@id='searchButton']")).click();
//
//        String currentUrl = driver.getCurrentUrl();
//        if (currentUrl.endsWith("Selenium_(software)")){
//            System.out.println("Pass");
//
//
//        }
//        else
//            System.out.println("Fail");



        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.de");
        driver.findElement(By.cssSelector("#a-autoid-0")).click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("selenium");
        driver.findElement(By.id("nav-search-submit-button")).click();

        String element = driver.findElement(By.cssSelector(".a-color-state")).getText();
        String text = driver.findElement(By.xpath("//div[@class='sg-col-14-of-20 sg-col s-breadcrumb sg-col-10-of-16 sg-col-6-of-12']/div/div/span[1]")).getText();

        System.out.println(text+" "+element);

    }
}
