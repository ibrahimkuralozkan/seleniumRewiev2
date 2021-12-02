package com.smartphone.Pages;

import com.smartphone.utilities.ConfigurationReader;
import com.smartphone.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage   {

    public LoginPage(){
      PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(id = "prependedInput")
    public WebElement usernameInput;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;

    @FindBy(id = "_submit")
    public WebElement loginBtn;


    public void login(String username,String password){

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();


    }
    public void loginasdriver(){

        usernameInput.sendKeys(ConfigurationReader.get("driver_username"));
        passwordInput.sendKeys(ConfigurationReader.get("driver_password"));
        loginBtn.click();


    }


}
