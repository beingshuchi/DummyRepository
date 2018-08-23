package com.cg.registration.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"feature"},
		glue= {"com.cg.registration.stepdefinition"}
)
public class TestRunner {

}
