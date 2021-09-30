package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.generic.DriverManager;
import com.generic.MasterPageFactory;
import com.generic.ZooplaLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefLogin {
	WebDriver driver;
	MasterPageFactory mpf;
	@Given("open browser and send URL")
	public void setup() {
		driver = new DriverManager().getDriver();
		
	}
	
	@When("login with valid credentials")
	public void getLogin() {
		new ZooplaLogin().getLogin(driver);
		
	}
	
	@Then("Check login was succesful")
	public void getValidation() {
		
		driver.quit();
	}

}
