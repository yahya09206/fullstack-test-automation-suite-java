package com.yahya.day04;

import com.yahya.tests.SeleniumDryRun;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatingDropdownList {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/dropdown");

        // TODO: Identify the first dropdown
        WebElement yearDropdown = driver.findElement(By.id("year"));
        // TODO: Wrap it up using Select class
        Select yearSelectObj = new Select(yearDropdown);
        // TODO: Select items in 3 different ways
        yearSelectObj.selectByIndex(2);

        Thread.sleep(2000);

        yearSelectObj.selectByValue("2019");

        Thread.sleep(2000);

        yearSelectObj.selectByVisibleText("1990");

        Thread.sleep(2000);

        driver.quit();



    }
}
