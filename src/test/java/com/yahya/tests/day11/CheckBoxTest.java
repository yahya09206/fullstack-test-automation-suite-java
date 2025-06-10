package com.yahya.tests.day11;

import com.yahya.pages.CheckBoxPage;
import com.yahya.utility.BrowserUtil;
import org.junit.jupiter.api.Test;

public class CheckBoxTest {

    @Test
    public void checkIfSelected(){

        CheckBoxPage checkBoxPage = new CheckBoxPage();

        checkBoxPage.goTo();
        checkBoxPage.selectBox();
        BrowserUtil.waitFor(3);
    }
}
