package com.smartphone.tests.day_12_properties_driver_tests;

import com.smartphone.tests.TestBase;
import com.smartphone.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {



@Test
    public void OpenBrowserWithConf(){

        driver.get(ConfigurationReader.get("url"));
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
actions.perform();

}







}
