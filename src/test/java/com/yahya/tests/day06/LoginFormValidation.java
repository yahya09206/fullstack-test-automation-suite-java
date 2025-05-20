package com.yahya.tests.day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFormValidation {

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
    public void testForLogin() throws InterruptedException {

        driver.get("https://practice.cydeo.com/login");

        WebElement headerTag = driver.findElement(By.xpath("//div/h2[.='Login Page']"));
        System.out.println("headerTag.getText() = " + headerTag.getText());
        Assertions.assertTrue(headerTag.isDisplayed());

        WebElement username = driver.findElement(By.xpath("//div/input[@name='username']"));
        username.sendKeys("tomsmith");

        WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
        password.sendKeys("SuperSecretPassword");

        driver.findElement(By.id("wooden_spoon")).click();

        Thread.sleep(2000);

        WebElement flashMsg = driver.findElement(By.xpath("//div[@id='flash']"));
        Assertions.assertTrue(flashMsg.isDisplayed());


    }
}
