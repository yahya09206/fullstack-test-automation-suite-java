package com.yahya.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Open Chrome and Navigate to https://facebook.com
 * Enter username invalid username into username box
 * Enter password some password box
 * Click on the Login button and wait few seconds until error comes back
 * Navigate back to log in screen
 * Click on forget password link
 * Enter something into Mobile number text box 123456789
 * Click on the search button
 * Click on the cancel button
 * Quit the browser
 */
public class Facebook {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://facebook.com");

        WebElement username = driver.findElement(By.xpath("//div/input[@id='email']"));
        username.sendKeys("username");

        WebElement password = driver.findElement(By.xpath("//div/input[@id='pass']"));
        password.sendKeys("password");

        driver.findElement(By.xpath("//div/button[@name='login']")).click();

        Thread.sleep(2000);

        driver.navigate().back();

        driver.findElement(By.partialLinkText("Forgot")).click();

        WebElement phoneNumber = driver.findElement(By.xpath("//td/input[@name='email']"));
        phoneNumber.sendKeys("234432233");

        driver.findElement(By.xpath("//div/button[@name='did_submit']")).click();

        driver.findElement(By.xpath("//div/a[@role='button']")).click();

        driver.quit();


    }
}
