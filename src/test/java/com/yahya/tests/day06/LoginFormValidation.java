package com.yahya.tests.day06;

import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginFormValidation extends TestBase {


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
