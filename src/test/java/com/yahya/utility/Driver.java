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

        String browserName = ConfigReader.read("browser");

        // set up driver depending on which one is chosen after object is set to null/quit
        if (obj == null){

            switch (browserName){
                // according to browser type, this will set the correct driver chrome/firefox
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    obj = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    obj = new FirefoxDriver();
                    break;
                default:
                    obj = null;
                    System.out.println("UNKOWN BROWSER TYPE!!!" + browserName);
            }
            return obj;
        } else {
            // System.out.println("Already exists");
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
