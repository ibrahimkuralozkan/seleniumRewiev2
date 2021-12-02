package com.smartphone.tests.day_13_Page_Object_Model;

import com.smartphone.tests.TestBase;
import com.smartphone.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLginTest extends TestBase {

    @Test
    public void wrongpassword(){


      driver.findElement(By.id("prependedInput")).sendKeys("user1");
      driver.findElement(By.id("prependedInput2")).sendKeys("somepass"+Keys.ENTER);
       Assert.assertNotEquals(driver.getCurrentUrl(),"https://qa1.vytrack.com/user/login");


    }



}
