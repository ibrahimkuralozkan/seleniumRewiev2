package com.smartphone.tests.day_3;

import com.smartphone.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class verify_confirmation_message {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.findElement(By.xpath("//*[@id='forgot_password']/div/div/input")).sendKeys("abc@gmail.com");
        System.out.println(driver.findElement(By.xpath("//*[@id='forgot_password']/div/div/input")).getAttribute("value"));

        driver.findElement(By.xpath("//*[@id='form_submit']")).click();
        String textactual = driver.findElement(By.xpath("/html/body/div/div[2]/div/h4")).getText();
        String textexpected = "Your e-mail's been sent!";
        System.out.println("textactual = " + textactual);
        System.out.println("textexpected = " + textexpected);

        if (textactual.equals(textexpected)){
            System.out.println("Pass");

        }else
            System.out.println("Fail");
        driver.quit();
    }
}
