package com.httpMethods.java;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestingGetMethodWithJava {
	
	public void getTest() {
		Response response = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
		
		System.out.println("Status code ="+response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
		
		System.out.println("Data format ="+response.getContentType());//json
		Assert.assertEquals(response.getContentType(), "application/json");
		Assert.assertTrue(response.getContentType().contains("json"));
		
		System.out.println("Response time="+response.getTime());//time
		Assert.assertTrue(response.getTime()<2000);
		
		//System.out.println(response.asString());//print the whole data
		//response.prettyPrint();
		System.out.println("Is response null or not="+response.toString()!=null);
		
	}

	public static void main(String[] args) {
		new TestingGetMethodWithJava().getTest();
		
	}
}
