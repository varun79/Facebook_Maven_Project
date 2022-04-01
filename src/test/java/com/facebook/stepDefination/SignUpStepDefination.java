package com.facebook.stepDefination;

import com.facebook.pageObject.SignUpPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpStepDefination extends SignUpPage{

	SignUpPage sup= new SignUpPage();
	
	@When("User enter firstname(.*)$")
	public void user_enter_firstname(String firstname) {
	   
		sup.firstname(firstname);
	}

	@When("User enter lastname(.*)$")
	public void user_ehter_lastname(String lastname) {
	    
		sup.lastname(lastname);
	}
	
	@Then("User should be  able to Signup Successfully")
	public void user_should_be_able_to_signup_successfully() {
		
		sup.verifySignUp();
	   
	}
}
