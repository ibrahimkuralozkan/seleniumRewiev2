package com.smartphone.tests.day_4;

import com.smartphone.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tagName {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
//        driver.findElement(By.xpath("//*[@id='login']/div[1]/div/input")).sendKeys("ahmet");
//        driver.findElement(By.xpath("//*[@id='login']/div[2]/div/input")).sendKeys("abc@gmail.com");
//driver.findElement(By.xpath("//*[@id='login']/button")).click();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
String text = driver.findElement(By.xpath(" /html/body/div/div[2]/div/div[1]/h3")).getText();
        System.out.println(text);
        String text2 = driver.findElement(By.xpath("//*[@id='content']/div[1]/h3")).getAttribute("value");
        System.out.println(text2);
//*[@id="content"]/div[1]/h3
       // /html/body/div/div[2]/div/div[1]/h3
        driver.quit();

    }
}
