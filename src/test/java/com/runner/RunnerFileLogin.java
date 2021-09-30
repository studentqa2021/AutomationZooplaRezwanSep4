package com.runner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(publish = true,plugin = { "pretty", "html:target/site/cucumber-pretty", "rerun:target/rerun.txt",
			"json:target/cucumber.json",
			},

			features = { "src/test/resources/Login.feature" }, 
			glue = { "com.stepdefinition" }, // package name
			monochrome = true, dryRun = false, strict = true
			// ,tags= {"@Function"}

	)

	public class RunnerFileLogin extends AbstractTestNGCucumberTests {

		@BeforeTest
		public void setup() {
			// code
		}
		
		@Test
		public void loginTest() {
			
		}
		
		@AfterTest
		public void tearDown() {
			
		}
	}

