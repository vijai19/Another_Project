package org.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginpageaddactin {

	@Given("User is standing in UI of application")
	public void user_entering_standing_in_ui_of_application() {
	    System.out.println("User is standing in UI of application");
	}

	@When("User entered the valid username")
	public void user_entered_the_valid_username() {
		System.out.println("User entered the valid username");
	}

	@When("User entered the valid password")
	public void user_entered_the_valid_password() {
		System.out.println("User entered the valid password");
	}

	@When("User clicking the login")
	public void user_clicking_the_login() {
		System.out.println("User clicking the login");
	}

	@Then("User is navigated to landing page")
	public void user_is_navigated_to_landing_page() {
		System.out.println("User is navigated to landing page");
	}

}
