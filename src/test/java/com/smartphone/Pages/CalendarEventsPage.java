package com.smartphone.Pages;

import com.smartphone.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalendarEventsPage extends BasePage {

    public CalendarEventsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "[title='Create Calendar event']")
    public WebElement createCalendarEvent;

    @FindBy(css = "div[class='btn btn-link dropdown-toggle']")
    public WebElement options;

    @FindBy(css = "input[type='number']")
    public WebElement pageNumber;

    @FindBy(xpath = "//label[@class='control-label']/../div/button")
    public WebElement viewPerPage;

    @FindBy(xpath = "//label[@class='dib'][3]")
    public WebElement totalRecords;


    public int getNumberOfTotalRecords(){
        String num="";

        for (String ch : totalRecords.getText().split("")  ) {
            if (Character.isDigit(ch.charAt(0))){
                num+=ch;
            }
        }
        int nm = Integer.valueOf(num);
        return nm;
    }

    public int getNumberOfRows(){
        return Driver.get().findElements(By.xpath("//table/tbody/tr")).size();
    }

    @FindBy(xpath = "//th//input[@type=\"checkbox\"]")
    public WebElement checkBoxForAll;

    @FindBy(xpath = "//tbody//input[@data-role='select-row-cell']")
    public List<WebElement> checkboxes;

    @FindBy(xpath = "//i[@class='fa-filter hide-text']")
    public WebElement filter;

    @FindBy(xpath = "//div[contains(text(),'Title')]")
    public WebElement title;

    @FindBy(xpath = "//input[@type='text'][@name='value']")
    public WebElement containsBox;

    @FindBy(xpath = "//button[.='Update']")
    public WebElement updateButton;

    @FindBy(xpath = "//td[.='Testers Meeting']")
    public WebElement meetingLink;

    @FindBy(xpath = "//div[.='Testers Meeting']")
    public WebElement verifyInfo;



}