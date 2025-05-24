package com.yahya.tests.day09;

import com.yahya.utility.BrowserUtil;
import com.yahya.utility.TestBase;
import com.yahya.utility.WebOrderUtility;
import io.restassured.internal.common.assertion.Assertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebOrderTest extends TestBase {

    @Test
    public void testLogin(){

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");

//        WebOrderUtility.login(driver);
        WebOrderUtility.login(driver, "Tester", "test");

        WebElement h1Header = driver.findElement(By.xpath("//div/h2[normalize-space()='List of All Orders']"));
        Assertions.assertTrue(h1Header.isDisplayed());

        BrowserUtil.waitFor(3);
        WebOrderUtility.logout(driver);

    }
}
