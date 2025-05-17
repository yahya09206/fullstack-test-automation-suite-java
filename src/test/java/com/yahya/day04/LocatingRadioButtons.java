package com.yahya.day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Navigate to radio_buttons page
 * Select radio button by id "blue"
 */
public class LocatingRadioButtons {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement blueRadio = driver.findElement(By.id("blue"));
        System.out.println("blueRadio.getDomAttribute(\"name\") = " + blueRadio.getDomAttribute("name"));
        System.out.println("blueRadio.isSelected() = " + blueRadio.isSelected()); // true because it is selected
        blueRadio.click(); // nothing will happen because it is already selected

        WebElement redRadio = driver.findElement(By.id("red"));
        System.out.println("redRadio.getDomAttribute(\"name\") = " + redRadio.getDomAttribute("name"));
        System.out.println("redRadio.isSelected() = " + redRadio.isSelected());
        redRadio.click();
        System.out.println("redRadio.isSelected() = " + redRadio.isSelected());

        System.out.println("blueRadio.isSelected() = " + blueRadio.isSelected());

        WebElement greenRadio = driver.findElement(By.id("green"));
        System.out.println("greenRadio.isSelected() = " + greenRadio.isSelected());
        System.out.println("greenRadio.isEnabled() = " + greenRadio.isEnabled());

        List<WebElement> allColors = driver.findElements(By.name("color"));
        System.out.println("allColors.size() = " + allColors.size());
        allColors.get(2).click();
        System.out.println("allColors.get(2).isSelected() = " + allColors.get(2).isSelected());

        for (WebElement allColor : allColors) {
            System.out.println("allColor.isSelected() = " + allColor.isSelected());
            System.out.println("allColor.isEnabled() = " + allColor.isEnabled());
            System.out.println("allColor.isDisplayed() = " + allColor.isDisplayed());
        }


        driver.quit();
    }
}
