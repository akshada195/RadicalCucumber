package com.GetValidateValuesWithDataDrivenSD;

import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetValidation {
	Response response;

	@Given("hit the URI")
	public void hit_the_uri() {
		response = RestAssured.get("https://demoqa.com/BookStore/v1/Books");
		System.out.println("got the response");
	}

	@Then("validate value for attribute {string} is {string} present in response")
	public void validate_value_for_attribute_is_present_in_response(String str1, String expValue) {
		List<Object> allItem = response.getBody().jsonPath().getList("books."+str1);
		System.out.println("==="+allItem.toString());
		Assert.assertTrue(allItem.contains(expValue));
		
	}
	@Then("validate value for {string} is {string}")
	public void validate_value_for(String str1, String str2) {
		String dataString = response.getBody().asString();
		String actualTitleString = response.getBody().jsonPath().getString(str1);
		Assert.assertTrue(actualTitleString.equals(str2));
	}
}
