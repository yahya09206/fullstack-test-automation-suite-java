package com.yahya.tests.day08;

import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends TestBase {

    @Test
    public void testUpload() throws InterruptedException {

        driver.get("https://practice.cydeo.com/upload");

        WebElement inputField = driver.findElement(By.id("file-upload"));
        String filePath = "/Users/yahyahussein91/Library/Mobile Documents/com~apple~CloudDocs/Desktop/Screenshot 2025-04-01 at 12.43.36 PM.png";
        inputField.sendKeys(filePath);

        driver.findElement(By.id("file-submit")).click();

        Thread.sleep(2000);
    }
}
