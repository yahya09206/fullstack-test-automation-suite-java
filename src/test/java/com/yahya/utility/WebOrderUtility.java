package com.yahya.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebOrderUtility {

    public static void login(WebDriver driver, String username, String password){

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
    }
}
