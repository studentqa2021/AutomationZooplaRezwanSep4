package com.httpMethods.cucumber;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StepDefGetMethod {
	Response response;
	@Given("pass the URL")
	public void pass_the_url() {
		response = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
	    
	}

	@Then("validate status code")
	public void validate_status_code() {
		System.out.println("Status code ="+response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
	    
	}

	@Then("validate data format is Json")
	public void validate_data_format_is_json() {
		System.out.println("Data format ="+response.getContentType());//json
		Assert.assertEquals(response.getContentType(), "application/json");
		Assert.assertTrue(response.getContentType().contains("json"));
	    
	}

	@Then("validate response time")
	public void validate_response_time() {
		System.out.println("Response time="+response.getTime());//time
		Assert.assertTrue(response.getTime()<2000);
	    
	}

	@Then("validate response should not be null")
	public void validate_response_should_not_be_null() {
		System.out.println("Is response null or not="+response.toString()!=null);
	    
	}

}
