package com.smartphone.tests.day_8_types_of_elements2;

import com.smartphone.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class List_Of_ELements {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();


    }
    @Test
    public void test1(){

        List<WebElement> buttons = driver.findElements(By.xpath("//*[@id='content']/div[1]/button"));
        System.out.println(buttons.size());

        Assert.assertEquals(buttons.size(),6);
        for (WebElement button : buttons)
              {

                  System.out.println(button.getText()+" isDisplayed() = " + button.isDisplayed());
                  Assert.assertTrue(button.isDisplayed());
            
        }

        buttons.get(1).click();
    }


    @Test
    public void test2() throws InterruptedException {

        WebElement statedropdown= driver.findElement(By.id("state"));
        Select states = new Select(statedropdown);
        System.out.println(states.getOptions().size());
        System.out.println(states.getOptions().contains("al"));
        System.out.println(states.getFirstSelectedOption().getText());

        states.selectByVisibleText("Alaska");
        Thread.sleep(2000);
        System.out.println("states.getFirstSelectedOption().getText() = " + states.getFirstSelectedOption().getText());
        states.selectByIndex(51);
        Thread.sleep(1000);
        states.selectByValue("TX");

    }



    @Test
    public void test3() throws InterruptedException {

        WebElement internetdropdown= driver.findElement(By.cssSelector("#dropdownMenuLink"));
        internetdropdown.click();
        Thread.sleep(1000);
        List<WebElement> dropdownoptions = driver.findElements(By.className("dropdown-item"));
        System.out.println("dropdownoptions.size() = " + dropdownoptions.size());

        for (WebElement option:dropdownoptions
             ) {
            System.out.println(option.getText());
        }
        dropdownoptions.get(4).click();
    Thread.sleep(1000);
    }






}


