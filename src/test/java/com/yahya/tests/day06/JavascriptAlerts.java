package com.yahya.tests.day06;

import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class JavascriptAlerts extends TestBase {

    /**
     * 3 types of javascript popups
     * regular(ok) only click on ok
     * confirm(ok and cancel)
     * prompt(enter text) and select ok and cancel
     */
    @Test
    public void testJavascriptAlert(){

        driver.get("https://practice.cydeo.com/javascript_alerts");

        /**
         * Alert interface from Selenium is used to deal with alerts
         * driver object can switchTo() the alert to perform any actions on it
         *
         * first need to switch to the alert box since it's not part of html
         * using switchTo() method followed by alert() method
         * .alert() method will return an Alert type from Selenium
         */
        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();

        driver.switchTo().alert().accept();

        System.out.println("THE END");



    }
}
