package com.yahya.tests.day09;

import com.yahya.utility.BrowserUtil;
import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitTest extends TestBase {

    @Test
    public void testWaitForTitle(){

        driver.get("https://practice.cydeo.com/dynamic_loading");

        // click on example 7
        driver.findElement(By.partialLinkText("Example 7:")).click();

        // wait until the title loads
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.titleIs("Dynamic Title"));


    }
}
