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
         *  check if box1 is initially selected
         *  check if box2 is selected
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/checkboxes");

        WebElement firstBox = driver.findElement(By.id("box1"));
        System.out.println("firstBox.isSelected() = " + firstBox.isSelected());

        WebElement secondBox = driver.findElement(By.id("box2"));
        System.out.println("secondBox.isSelected() = " + secondBox.isSelected());

        driver.quit();


    }
}
