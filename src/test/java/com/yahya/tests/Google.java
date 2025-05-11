package com.yahya.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.List;


/**
 * navigate to https://google.com
 * search for selenium
 * click google search button
 * identify the div that holds the search result count on next page About 95,900,000 results (0.58 seconds)
 * get the text of that element
 * Optionally , if you want some java practice , go ahead and extract the number of result and save it into long variable OPTIONALLy
 * get all the link that contain text selenium into a List
 * get the count
 * get the first one text
 * get the last one text
 * iterate over the list and print the text of each link
 * watch the short to learn more about findElement(By.tagName("tag here"))
 * watch the short to learn more about element.getAttribute("attribute goes here")
 */
public class Google {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        WebElement searchBox = driver.findElement(By.xpath("//div/textarea[@name='q']"));
        searchBox.sendKeys("selenium");

        WebElement searchBtn = driver.findElement(By.xpath("//div/center/input[@name='btnK']"));
        searchBtn.sendKeys("selenium", Keys.ENTER);

        List<WebElement> listOfSelenium = driver.findElements(By.partialLinkText("selenium"));
        System.out.println("listOfSelenium.size() = " + listOfSelenium.size());

        Thread.sleep(2000);
        driver.quit();

    }
}
