package com.smartphone.tests.day_12_properties_driver_tests;

import com.smartphone.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Singleton_Test {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver2 = Driver.get();
        Thread.sleep(2000);
       Driver.get().get("https://www.google.com");



    }
    @Test
    public void test2(){


        WebDriver driver = Driver.get();
        Driver.get().get("https://www.amazon.com");
driver.quit();
    }

}
