package com.smartphone.tests.day_13_Page_Object_Model;

import com.smartphone.Pages.CalendarEventsPage;
import com.smartphone.Pages.DashboardPage;
import com.smartphone.Pages.LoginPage;
import com.smartphone.tests.TestBase;
import com.smartphone.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.rmi.runtime.Log;

public class PageSubtitleTest extends TestBase {
    /*


    Test case
    OpenBrowser
    Login as driver
    Verify subtitle is Quick launchpad
    Go activities ->Calendar evennts


     */


    @Test
    public void test1() {

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsDriver();
        DashboardPage dashboardPage = new DashboardPage();
        String expected = "Quick Launchpad";
        String actual = dashboardPage.getPageSubTitle();
        Assert.assertEquals(expected, actual, "verifiy subtitle ");
        dashboardPage.navigateToModule("Activities", "Calendar Events");
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        Assert.assertEquals(calendarEventsPage.getPageSubTitle(),"Calendar Events");
    }


}
