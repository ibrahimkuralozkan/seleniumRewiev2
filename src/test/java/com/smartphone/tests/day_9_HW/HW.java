package com.smartphone.tests.day_9_HW;

import com.smartphone.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HW {
    WebDriver driver;


    @BeforeMethod
    public void setUp(){
    driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void TearDown(){
        driver.quit();
    }

    @Test
    public void test1(){

        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Registration Form")).click();
        WebElement birth=driver.findElement(By.xpath("(//input[@class='form-control'])[7]"));
        birth.sendKeys("wrong_dob");
        WebElement text = driver.findElement(By.xpath("//*[text()='The date of birth is not valid']"));
        Assert.assertTrue(text.isDisplayed(),"verify that text is not displayed");
    }


    @Test
    public void test2(){

        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Registration Form")).click();
        Assert.assertTrue(driver.findElement(By.id("inlineCheckbox1")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("inlineCheckbox2")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("inlineCheckbox3")).isDisplayed());

    }

    @Test
    public void test3(){

        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("a");
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='first name must be more than 2 and less than 64 characters long']")).isDisplayed());


    }

    @Test
    public void test4() throws InterruptedException {

        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Registration Form")).click();
        // driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("a");
      WebElement state= driver.findElement(By.xpath("//select[@name='department']"));
        Select country =  new Select(driver.findElement(By.xpath("//select[@name='department']")));
        country.selectByVisibleText("MPDC");
        Thread.sleep(2000);
        Select job=new Select(driver.findElement(By.xpath("//select[@name='job_title']")));
        job.selectByVisibleText("QA");
        Thread.sleep(2000);



    }

    @Test
    public void test5() throws InterruptedException {

        driver.get("https://www.fakemail.net/");
        WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
        String emailtext = email.getText();
        driver.quit();
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");

        WebElement signupbutton = driver.findElement(By.linkText("Sign Up For Mailing List"));
        signupbutton.click();
        driver.findElement(By.name("full_name")).sendKeys("Ahmet");
        driver.findElement(By.name("email")).sendKeys(emailtext);
        driver.findElement(By.name("wooden_spoon")).click();






    }





}
