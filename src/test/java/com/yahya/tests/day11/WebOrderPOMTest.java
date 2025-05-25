package com.yahya.tests.day11;

import com.yahya.pages.WLoginPage;
import com.yahya.utility.BrowserUtil;
import com.yahya.utility.Driver;
import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;

public class WebOrderPOMTest extends TestBase {

    @Test
    public void testWithPOMForLogin(){


        WLoginPage loginPage = new WLoginPage();

        loginPage.goTo();
        loginPage.login("Tester", "test");

        BrowserUtil.waitFor(3);

    }
}
