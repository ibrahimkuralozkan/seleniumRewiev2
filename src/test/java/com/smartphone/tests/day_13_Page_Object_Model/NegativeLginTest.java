package com.smartphone.tests.day_13_Page_Object_Model;

import com.smartphone.Pages.LoginPage;
import com.smartphone.tests.TestBase;
import com.smartphone.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class NegativeLginTest extends TestBase {

    @Test
    public void wrongpassword() {

        LoginPage loginPage = new LoginPage();
        loginPage.usernameInput.sendKeys(ConfigurationReader.get("storemanager_username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.get("storemanager_password"));
        loginPage.loginBtn.click();


    }

    @Test
    public void withmethod(){

        LoginPage loginPage = new LoginPage();
        String username=ConfigurationReader.get("driver_username");
        String password=ConfigurationReader.get("driver_password");


    }
    @Test
    public void witspecificmethod(){

     LoginPage loginPage = new LoginPage();
     loginPage.loginAsDriver();


    }


}
