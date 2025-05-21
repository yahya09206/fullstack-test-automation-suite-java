package com.yahya.tests.day06;

import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class SlowElementTest extends TestBase {

    @Test
    public void testWait() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://practice.cydeo.com/dynamic_controls");
        driver.findElement(By.xpath("//button[.='Remove']")).click();


        WebElement itsGoneElm = driver.findElement(By.id("message"));
        System.out.println("itsGoneElm.getText() = " + itsGoneElm.getText());
    }
}
