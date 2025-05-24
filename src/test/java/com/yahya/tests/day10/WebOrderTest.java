package com.yahya.tests.day10;

import com.yahya.utility.BrowserUtil;
import com.yahya.utility.Driver;
import com.yahya.utility.TestBase;
import com.yahya.utility.WebOrderUtil;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class WebOrderTest extends TestBase {

    @Test
    public void testDriver(){

        WebOrderUtil.openWebOrderApp();
        // assert that the page title is WebOrder Login to ensure you are on the correct page
        assertEquals("Web Orders Login", Driver.getDriver().getTitle());
        WebOrderUtil.login();
    }

    @Test
    public void testInvalidCredentials(){

        WebOrderUtil.openWebOrderApp();
        WebOrderUtil.login("blah", "adad");

//        WebElement errorMsg = driver.findElement(By.id("ctl00_MainContent_status"));
//        assertTrue(errorMsg.isDisplayed());

//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(2));
//        // check for visibility of error message element
//        try {
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='aaInvalid Login or Password.']")));
//        } catch (TimeoutException e){
////            System.out.println("e.getMessage() = " + e.getMessage());
//        }

        // check for element using the browser util just created
        boolean elementFound =
                BrowserUtil.checkVisibilityOfElement(By.xpath("//span[.='Invalid Login or Password.']"), 2);
        assertTrue(elementFound);

    }
}
