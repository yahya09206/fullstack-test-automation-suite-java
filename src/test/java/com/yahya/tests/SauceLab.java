package com.yahya.tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * open chrome and navigate to https://www.saucedemo.com/v1/
 * verify the title is Swag Labs with if statement
 * click on sign in button
 * enter text as “standard_user” into username box
 * enter text “secret_sauce” into password box
 * submit by clicking login button
 * now use your imagination to play around here and explore , automate within the capacity we already have so far.
 */
public class SauceLab {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");

        WebElement username = driver.findElement(By.xpath("//div/form/input[@id='user-name']"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.xpath("//div/form/input[@id='password']"));
        password.sendKeys("secret_sauce", Keys.ENTER);

        if (driver.getTitle().equals("Swag Labs")){
            System.out.println("On the correct Page " + driver.getTitle());
        } else {
            System.out.println("Wrong page: " + driver.getTitle());
        }

        Thread.sleep(2000);
        driver.quit();

    }
}
