package com.yahya.tests.day09;

import com.yahya.utility.TestBase;
import com.yahya.utility.WebOrderUtility;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class WebOrderTest extends TestBase {

    @Test
    public void testLogin(){

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");

        WebOrderUtility.login(driver, "Tester", "test");
    }
}
