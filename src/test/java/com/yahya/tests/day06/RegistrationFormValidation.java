package com.yahya.tests.day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationFormValidation {

    WebDriver driver;

    @BeforeAll
    public static void setupDriver(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setupWebDriver(){
        driver = new ChromeDriver();
    }

    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }


    @Test
    public void registerFormTest() throws InterruptedException {

        driver.get("https://practice.cydeo.com/registration_form");
        //small[.='first name is required']

        WebElement errorMsg = driver.findElement(By.xpath("//small[.='first name must be more than 2 and less than 64 characters long']"));
        System.out.println("errorMsg.isDisplayed() = " + errorMsg.isDisplayed());

        WebElement firstnameBox = driver.findElement(By.xpath("//div/input[@name='firstname']"));
        firstnameBox.sendKeys("1");
        System.out.println("errorMsg.getText() = " + errorMsg.getText());

        Assertions.assertTrue(errorMsg.isDisplayed());

        Thread.sleep(2000);

    }
}
