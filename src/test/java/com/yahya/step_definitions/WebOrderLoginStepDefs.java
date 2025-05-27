package com.yahya.step_definitions;

import com.yahya.pages.WAllOrderPage;
import com.yahya.pages.WLoginPage;
import com.yahya.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

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

    @When("we provide invalid credentials")
    public void we_provide_invalid_credentials() {

        loginPage.login("testers", "test");
    }
    @Then("we should still be at login page")
    public void we_should_still_be_at_login_page() {
        Assertions.assertEquals("Web Orders Login", Driver.getDriver().getTitle());
    }
    @Then("login error message should be displayed")
    public void login_error_message_should_be_displayed() {

        loginPage.loginErrorMsgPresent();
    }

    @When("user provide username {string} and password {string}")
    public void userProvideUsernameAndPassword(String username, String password) {

        loginPage.login(username, password);
    }
}
