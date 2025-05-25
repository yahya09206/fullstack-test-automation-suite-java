package com.yahya.tests.day11;

import com.yahya.pages.WAllOrderPage;
import com.yahya.pages.WLoginPage;
import com.yahya.utility.BrowserUtil;
import com.yahya.utility.Driver;
import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WebOrderPOMTest extends TestBase {

    @Test
    public void testWithPOMForLogin(){


        WLoginPage loginPage = new WLoginPage();

        loginPage.goTo();
        loginPage.login("Testers", "test");
        assertTrue(loginPage.loginErrorMsgPresent());
        BrowserUtil.waitFor(3);

    }

    @Test
    public void testWithPOMForAllOrdersPage(){

        WLoginPage loginPage = new WLoginPage();
        loginPage.goTo();
        loginPage.login("Tester", "test");


        WAllOrderPage allOrderPage = new WAllOrderPage();
        assertTrue(allOrderPage.headerElm.isDisplayed());
        allOrderPage.checkAllBtn.click();

        BrowserUtil.waitFor(2);

        allOrderPage.uncheckAllBtn.click();

        BrowserUtil.waitFor(2);
    }
}
