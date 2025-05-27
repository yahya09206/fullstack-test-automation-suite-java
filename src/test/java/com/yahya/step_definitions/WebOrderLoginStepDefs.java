package com.yahya.step_definitions;

import com.yahya.pages.WAllOrderPage;
import com.yahya.pages.WLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebOrderLoginStepDefs {

    WLoginPage loginPage;

    @Given("we are at web order login page")
    public void we_are_at_web_order_login_page() {

        loginPage = new WLoginPage();
        loginPage.goTo();

    }
    @When("we provide valid credentials")
    public void we_provide_valid_credentials() {

        loginPage.login("Tester", "test");

    }
    @Then("we should see all orders page")
    public void we_should_see_all_orders_page() {

        WAllOrderPage wAllOrderPage = new WAllOrderPage();
        wAllOrderPage.headerElm.isDisplayed();

    }
}
