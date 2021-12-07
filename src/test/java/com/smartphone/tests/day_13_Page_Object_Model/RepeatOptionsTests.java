package com.smartphone.tests.day_13_Page_Object_Model;

import com.smartphone.Pages.CalendarEventsPage;
import com.smartphone.Pages.CreateCalendarEventsPage;
import com.smartphone.Pages.DashboardPage;
import com.smartphone.Pages.LoginPage;
import com.smartphone.tests.TestBase;
import com.smartphone.tests.day_12_properties_driver_tests.LoginTest;
import com.smartphone.utilities.BrowserUtils;
import com.smartphone.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.dnd.DragGestureEvent;
import java.nio.file.WatchEvent;

public class RepeatOptionsTests extends TestBase{
/*
Open Browser
Login as Driver
Go to Activities -> Calendar Events
Click create calendar events
click repeat
Verify that repeat weekday is not checked
 */

    @Test
    public void test1(){

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsDriver();
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule("Activities","Calendar Events");
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        //BrowserUtils.waitForClickablility(calendarEventsPage.createCalendarEvent,20);
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        calendarEventsPage.createCalendarEvent.click();
        CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();
        createCalendarEventsPage.repeat.click();
        Assert.assertTrue(createCalendarEventsPage.days.isSelected());
        Assert.assertFalse(createCalendarEventsPage.weekday.isSelected());
   }

   @Test
    public void test2(){
       LoginPage loginPage = new LoginPage();
       loginPage.loginAsDriver();
       DashboardPage dashboardPage = new DashboardPage();
       dashboardPage.navigateToModule("Activities","Calendar Events");
       CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
       //BrowserUtils.waitForClickablility(calendarEventsPage.createCalendarEvent,20);
       calendarEventsPage.waitUntilLoaderScreenDisappear();
       calendarEventsPage.createCalendarEvent.click();
       CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();
       createCalendarEventsPage.repeat.click();
       WebElement dropdownelement=driver.findElement(By.cssSelector("#recurrence-repeats-view874"));
       Select dropdowntest = new Select(dropdownelement);







   }


}
