package com.yahya.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JobStepDef {

    @Given("you are prepared for a job")
    public void you_are_prepared_for_a_job() {
        System.out.println("CONDITION 1: YOU ARE PREPARED FOR THE JOB");
    }
    @Given("you are in the market")
    public void you_are_in_the_market() {
        System.out.println("CONDITION 2: YOU ARE IN THE MARKET");
    }
    @When("you apply for {int} jobs a day")
    public void you_apply_for_jobs_a_day(Integer applicationCount) {
        System.out.println("WHEN APPLYING FOR " + applicationCount + " jobs a day");
    }
    @Then("you will eventually get the job")
    public void you_will_eventually_get_the_job() {
        System.out.println("THEN YOU SHOULD GET THE JOB");
    }
}
