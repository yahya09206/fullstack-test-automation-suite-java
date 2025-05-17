package com.yahya.day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingCheckboxes {
    public static void main(String[] args) {

        /**
         * Set up chromedriver
         * Navigate to practice site
         * Identify first check box
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/checkboxes");

        WebElement firstBox = driver.findElement(By.id("box1"));
    }
}
