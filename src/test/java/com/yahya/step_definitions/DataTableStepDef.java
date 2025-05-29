package com.yahya.step_definitions;

import com.yahya.pages.WLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class DataTableStepDef {

    @Given("I have a {string}")
    public void i_have_a(String animal) {
        System.out.println("Given I have a " + animal);
    }
    @When("I call their names")
    public void i_call_their_names() {
        System.out.println("When I call their names");
    }
    @Then("They come to me")
    public void they_come_to_me() {
        System.out.println("Then they come to me");
    }

    @Given("I have the following animals")
    public void iHaveTheFollowingAnimals(List<String> animalList) {

        System.out.println("animalList = " + animalList);

    }

    @When("I call their names with below names")
    public void iCallTheirNamesWithBelowNames(List<String> names) {

        System.out.println("names = " + names);
    }

    @When("we provide below credentials")
    public void weProvideBelowCredentials(Map<String, String> credentialsMap) {
        String usernameFromTable = credentialsMap.get("username");
        String passwordFromTable = credentialsMap.get("password");

        System.out.println("credentialsMap = " + credentialsMap);
        WLoginPage loginPage = new WLoginPage();
        loginPage.login(usernameFromTable, passwordFromTable);
    }
}
