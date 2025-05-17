package com.yahya.day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingMultipleFromDropdown {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/dropdown");

        // TODO: Identify Multi-language dropdown
        WebElement langDropdown = driver.findElement(By.name("Languages"));
        Select langSelectObj = new Select(langDropdown);

        System.out.println("langSelectObj.isMultiple() = " + langSelectObj.isMultiple());

        langSelectObj.selectByIndex(2);
        Thread.sleep(2000);
        langSelectObj.selectByValue("c");
        Thread.sleep(2000);
        langSelectObj.selectByVisibleText("Java");
        Thread.sleep(2000);

        driver.quit();
    }
}
