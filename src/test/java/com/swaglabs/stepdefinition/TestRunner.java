package com.swaglabs.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//src//test//resources//Login.feature",
		glue = "com.swaglabs.stepdefinition",
		plugin = "html:target",
		monochrome = true,
		dryRun =  false,
		
		tags = "@TestA"
		
		)

public class TestRunner {
	


}
