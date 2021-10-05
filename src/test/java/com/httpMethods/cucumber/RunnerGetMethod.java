package com.httpMethods.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(publish = true,plugin = { "pretty", 
		"html:target/site/cucumber-pretty", "rerun:target/rerun.txt",
		"json:target/cucumber.json",
		},

		features = { "src/test/resources/API get method.feature" }, 
		glue = { "com.httpMethods.cucumber" }, // package name
		monochrome = true, dryRun = false, strict = true
		// ,tags= {"@Function"}

)

public class RunnerGetMethod extends AbstractTestNGCucumberTests {

}
