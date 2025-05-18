package com.yahya.day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByXPath {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/checkboxes");

//        WebElement headerSpan = driver.findElement(By.xpath("//h1/span[@class='h1y']"));
//        System.out.println("headerSpan.getText() = " + headerSpan.getText());

        // //input[@id="box1"]
        driver.findElement(By.xpath("//input[@name=\"checkbox1\"]")).click();
    }
}
