package com.yahya.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static WebDriver obj;

    private Driver(){}

    /**
     * Return obj with only one WebDriver instane
     * @return
     */
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

    public static void closeBrowser(){
        // check if we have webdriver instance
        // if not null then quit the browser then make it null
        if (obj != null){
            obj.quit();
            obj = null; // new driver instance after previous one is quit
        }
    }
}
