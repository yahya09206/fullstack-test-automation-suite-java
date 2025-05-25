package com.yahya.tests.day11;

import com.yahya.pages.WLoginPage;
import com.yahya.utility.BrowserUtil;
import com.yahya.utility.Driver;
import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;

public class WebOrderPOMTest extends TestBase {

    @Test
    public void testWithPOMForLogin(){

        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?");

        WLoginPage loginPage = new WLoginPage();
        loginPage.usernameField.sendKeys("Tester");
        loginPage.passwordField.sendKeys("test");
        loginPage.loginButton.click();

        BrowserUtil.waitFor(3);

    }
}
