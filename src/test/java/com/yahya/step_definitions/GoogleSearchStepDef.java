package com.yahya.step_definitions;

import com.yahya.pages.GoogleHomePage;
import io.cucumber.java.en.Given;

public class GoogleSearchStepDef {

    GoogleHomePage homePage;

    @Given("user is at the homepage")
    public void user_is_at_the_homepage() {

        homePage = new GoogleHomePage();
        homePage.goTo();
    }
}