package com.yahya.utility;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebOrderUtility {

    public static void login(WebDriver driverParam){

        driverParam.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driverParam.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driverParam.findElement(By.id("ctl00_MainContent_login_button")).click();
    }

    public static void login(WebDriver driverParam, String username, String password){

        driverParam.findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
        driverParam.findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
        driverParam.findElement(By.id("ctl00_MainContent_login_button")).click();
    }

    public static void logout(WebDriver driverParam){

        driverParam.findElement(By.id("ctl00_logout")).click();
    }

    public static boolean isAtOrderPage(WebDriver driverParam){

        boolean result = false;
        try {
            WebElement h1Header = driverParam.findElement(By.xpath("//h2[normalize-space(.)='List of All Orders']"));
            System.out.println("ELEMENT WAS IDENTIFIED");
            result = true;
        }catch (NoSuchElementException e){
            System.out.println("NO SUCH ELEMENT, YOU ARE NOT AT THE RIGHT PAGE");
        }

        return result;

    }
}
