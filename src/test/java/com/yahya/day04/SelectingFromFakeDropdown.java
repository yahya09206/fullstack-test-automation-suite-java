package com.yahya.day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingFromFakeDropdown {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/dropdown");

        // Identify the fake dropdown which is actually a link along with its items
        WebElement fakeDropdown = driver.findElement(By.id("dropdownMenuLink"));
        fakeDropdown.click();

        // click option
        driver.findElement(By.linkText("Google")).click();

        driver.quit();
    }
}
