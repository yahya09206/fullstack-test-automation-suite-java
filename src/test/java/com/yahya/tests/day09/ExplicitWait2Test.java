package com.yahya.tests.day09;

import com.yahya.utility.BrowserUtil;
import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class ExplicitWait2Test extends TestBase {

    @Test
    public void waitUntilElementInteractable(){

        driver.get("https://practice.cydeo.com/dynamic_controls");

        driver.findElement(By.xpath("//button[.='Enable']")).click();

        WebElement inputField = driver.findElement(By.cssSelector("form#input-example>input"));
        System.out.println("inputField.isEnabled() = " + inputField.isEnabled());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        //wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("form#input-example>input")));
        wait.until(elementToBeClickable(inputField));

        // enter something into input field
        inputField.sendKeys("Hello world");

        BrowserUtil.waitFor(5);

    }
}
