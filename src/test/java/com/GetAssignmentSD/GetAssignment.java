package com.GetAssignmentSD;

import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAssignment {
	Response response;

	@Given("Hit the URI")
	public void Hit_the_URI() {
		response = RestAssured.get("https://demoqa.com/BookStore/v1/Books");
	}
	
	@Then("validate title available in response")
	public void validate_title_available_in_response() {
		
	}
	
}
