package com.yahya.tests.day08;

import com.yahya.utility.BrowserUtil;
import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverTest extends TestBase {

    @Test
    public void testHoverAction(){

        driver.get("https://practice.cydeo.com/hovers");

        // locate first image
        WebElement firstImg = driver.findElement(By.xpath("(//div[@class='figure']/img)[1]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(firstImg).perform();

        WebElement firstProfileElm = driver.findElement(By.xpath("//div/h5[.='name: user1']"));
        Assertions.assertTrue(firstProfileElm.isDisplayed());

        BrowserUtil.waitFor(2);

        WebElement secondImg = driver.findElement(By.xpath("(//div[@class='figure']/img)[2]"));
        actions.moveToElement(secondImg).perform();
        BrowserUtil.waitFor(2);

        WebElement thirdImg = driver.findElement(By.xpath("(//div[@class='figure']/img)[3]"));
        actions.moveToElement(thirdImg).perform();
        BrowserUtil.waitFor(2);

        actions.moveToElement(firstImg).pause(2000)
                .moveToElement(secondImg).pause(2000)
                .moveToElement(thirdImg).pause(2000).perform();

        BrowserUtil.waitFor(2000);
    }

    @Test
    public void testKeyboardAction(){

        // Navigate to google.com
        // hold down to shift enter text "I love selenium"
        // release the shift
        // enter the text "i love selenium"
        // hold down the command on mac control
        // hit backspace to delete
        driver.get("https://www.google.com");
        // locate search box using name value q
        WebElement searchBox = driver.findElement(By.name("q"));
        // create actions class instance
        Actions actions = new Actions(driver);
        // keyDown method for holding down certain modifiers like control, shift and so on
        // keyUp method for releasing what you are holding down
        // sendKeys method of Actions class is for pressing key that is provided
        // pause method is for pausing in between actions in ms
        actions.keyDown(Keys.SHIFT).sendKeys("i love selenium")
                .pause(2000).keyUp(Keys.SHIFT)
                .sendKeys("i love selenium").pause(2000)
                .perform();

    }
}
