package com.yahya.step_definitions;

import com.yahya.pages.YahooHomePage;
import com.yahya.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class YahooSearchStepDef {

    YahooHomePage homePage;

    @Given("user is at the homepage")
    public void user_is_at_the_homepage() {

        homePage = new YahooHomePage();
        homePage.goTo();

    }
    @When("user searches for keyword {string}")
    public void user_searches_for_keyword(String keyword) {

        homePage.searchKeyword(keyword);
    }
    @Then("we should see the results page")
    public void we_should_see_the_results_page() {

        System.out.println("I can check the title in the next method");
    }
    @Then("and the title should start with {string}")
    public void and_the_title_should_start_with(String keyword) {

        assertTrue(Driver.getDriver().getTitle().startsWith(keyword));
    }

}