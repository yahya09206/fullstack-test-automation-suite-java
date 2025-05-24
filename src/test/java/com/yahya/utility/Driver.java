package com.yahya.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static WebDriver obj;

    private Driver(){}

    public static WebDriver getDriver(){

        if (obj == null){
            WebDriverManager.chromedriver().setup();
            obj = new ChromeDriver();
            System.out.println("One and only created for the first time");
            return obj;
        } else {
            System.out.println("Already exists");
            return obj;
        }
    }
}
