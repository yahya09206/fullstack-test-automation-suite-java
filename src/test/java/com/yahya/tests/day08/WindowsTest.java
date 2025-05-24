package com.yahya.tests.day08;

import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class WindowsTest extends TestBase {

    @Test
    public void testWindowOrTab(){

        driver.get("https://practice.cydeo.com/open_new_tab");
        String currentHandle = driver.getWindowHandle();
        System.out.println("currentHandle = " + currentHandle);

        // get windowHandles() method and print them out
        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("allHandles = " + allHandles);
    }
}
