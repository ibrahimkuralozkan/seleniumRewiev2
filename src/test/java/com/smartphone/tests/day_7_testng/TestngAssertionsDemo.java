package com.smartphone.tests.day_7_testng;

import com.smartphone.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestngAssertionsDemo {



    @Test
    public void test3(){

        String et="Cyb";
        String at="Cybertek";
        Assert.assertTrue(at.startsWith(et));

    }

@Test
    public void test4(){

    String email="avcdgmail.com";

    Assert.assertTrue(email.contains("@"));

}




}
