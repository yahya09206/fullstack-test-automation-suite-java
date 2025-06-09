package com.yahya.step_definitions;

import com.yahya.pages.WSwagLogin;
import com.yahya.utility.BrowserUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagLogin {

    WSwagLogin wSwagLogin = new WSwagLogin();

    @Given("user is at swab labs login page")
    public void user_is_at_swab_labs_login_page() {

        // login method for swag labs
        wSwagLogin.goTo();
    }

    @When("user enters username {string} and passcode {string}")
    public void userEntersUsernameAndPasscode(String username, String password) {

        wSwagLogin.login(username, password);
        BrowserUtil.waitFor(3);
    }
    @Then("Then we should see all orders page")
    public void then_we_should_see_all_orders_page() {
        wSwagLogin.verifyProductsPage();
    }
}
