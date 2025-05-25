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
    public void she_eats_cucumbers(Integer int1) {

        System.out.println("This is @when code she_eats_cucumbers");
    }
    @Then("she will be full")
    public void she_will_be_full() {

        System.out.println("This is @Then code she_will_be_full");
    }

}
