package com.yahya.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatStepDefs {

    @Given("Alice is hungry")
    public void alice_is_hungry() {

        System.out.println("This is @Given code alice_is_hungry");
    }
    @When("she eats {int} cucumbers")
    public void she_eats_cucumbers(Integer quantity) {

        System.out.println("This is @when code she_eats_cucumbers " + quantity);
    }
    @Then("she will be full")
    public void she_will_be_full() {

        System.out.println("This is @Then code she_will_be_full");
    }

    @Given("Olivia is hungry")
    public void olivia_is_hungry() {
        System.out.println("@Given olivia is hungry");
    }
    @Then("he will be sick")
    public void he_will_be_sick() {
        System.out.println("@Then she will be sick");
    }

}
