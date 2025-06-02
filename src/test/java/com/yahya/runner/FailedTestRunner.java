package com.yahya.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//File for failed tests
@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/yahya/step_definitions",
        features = "@target/rerun.txt"
)
public class FailedTestRunner {
}
