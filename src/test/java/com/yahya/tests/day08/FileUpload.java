package com.yahya.tests.day08;

import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;

public class FileUpload extends TestBase {

    @Test
    public void testUpload(){

        driver.get("https://practice.cydeo.com/upload");
    }
}
