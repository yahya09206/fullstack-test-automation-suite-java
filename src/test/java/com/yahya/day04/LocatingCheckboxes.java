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
         *  get value of "checked" attribute
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/checkboxes");

        WebElement firstBox = driver.findElement(By.id("box1"));
        System.out.println("firstBox.isSelected() = " + firstBox.isSelected());
        System.out.println("firstBox.getAttribute(\"checked\") = " + firstBox.getAttribute("checked"));

        WebElement secondBox = driver.findElement(By.id("box2"));
        System.out.println("secondBox.isSelected() = " + secondBox.isSelected());
        System.out.println("secondBox.getAttribute(\"checked\") = " + secondBox.getAttribute("checked"));

        driver.quit();


    }
}
