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
         *      click 1st box to check it
         *      click 2nd box to uncheck it
         *          check if either are already selected by using if statement
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.id("box1"));
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        System.out.println("checkbox1.getAttribute(\"checked\") = " + checkbox1.getAttribute("checked"));

        WebElement checkbox2 = driver.findElement(By.id("box2"));
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());
        System.out.println("checkbox2.getAttribute(\"checked\") = " + checkbox2.getAttribute("checked"));

        checkbox1.click();
        checkbox2.click();

        if (!checkbox1.isSelected()){
            checkbox1.click();
        } else {
            System.out.println("Already selected");
        }

        if (!checkbox2.isSelected()){
            checkbox2.click();
        } else {
            System.out.println("Already selected");
        }

        driver.quit();



    }
}
