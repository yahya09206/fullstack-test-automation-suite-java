package com.yahya.day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoreXPath {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/forgot_password");

        // Select input box and type in email
        WebElement passwordBox = driver.findElement(By.xpath("//input[@name='email']"));
        passwordBox.sendKeys("user@email.com");

        // Select submit button and click it
        driver.findElement(By.xpath("//button[@id='form_submit' and @class='radius']")).click();
    }
}
