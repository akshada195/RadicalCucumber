package com.basic;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMS_StepDef {
	
	@Given("Login with admin user")
	public void login_with_admin_user() {
	    System.out.println("Login with admin user");
	}

	@When("Go to PIM Tab")
	public void go_to_pim_tab() {
		 System.out.println("Go to PIM Tab");
	}

	@Then("validate user getting searched")
	public void validate_user_getting_searched() {
		 System.out.println("validate user getting searched");
	}
	
	@Then("validate user not getting searched")
	public void validate_user_not_getting_searched() {
		 System.out.println("validate user not getting searched");
	}


}
