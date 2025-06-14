package com.yahya.tests.day11;

import com.yahya.pages.CheckBoxPage;
import com.yahya.utility.BrowserUtil;
import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;

public class CheckBoxTest extends TestBase {

    @Test
    public void checkIfSelected(){

        // new instance of checkbox page object
        CheckBoxPage checkBoxPage = new CheckBoxPage();

        checkBoxPage.goTo();
        checkBoxPage.selectBox1();
        BrowserUtil.waitFor(3);

        driver.quit();
    }
}
