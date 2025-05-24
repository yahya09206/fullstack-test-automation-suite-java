package com.yahya.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserUtil {

    public static void waitFor(int seconds){

        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static boolean checkVisibilityOfElement(By locator, int timeToWait){

        boolean result = false;
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeToWait));
        // check for visibility of error message element
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            result = true;
        } catch (TimeoutException e){
//            System.out.println("e.getMessage() = " + e.getMessage());
        }
        return result;
    }


}
