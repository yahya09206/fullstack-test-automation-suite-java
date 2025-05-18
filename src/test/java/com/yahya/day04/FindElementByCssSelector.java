package com.yahya.day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByCssSelector {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://search.yahoo.com/");

        // by id
        // WebElement searchBox = driver.findElement(By.cssSelector("#yschsp"));
        // by name
        // WebElement searchBox = driver.findElement(By.cssSelector("input[name='p']"));
        // multiple
        WebElement searchBox = driver.findElement(By.cssSelector("input[name='p'][type='text']"));
        searchBox.sendKeys("CSS Selector");

        Thread.sleep(2000);

        // clear text box
        driver.findElement(By.cssSelector("button#sbq-clear>span")).click();

        Thread.sleep(2000);

        searchBox.sendKeys("selenium");

        driver.findElement(By.cssSelector("button#sbq-submit>span")).click();

        Thread.sleep(2000);

        driver.quit();

    }
}
