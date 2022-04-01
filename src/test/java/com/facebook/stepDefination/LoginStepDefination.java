package com.facebook.stepDefination;

import com.facebook.pageObject.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;








public class LoginStepDefination extends LoginPage {

	LoginPage lp= new LoginPage();
	
	@Given("^I am user of facebook application$")
	public void i_am_user_of_facebook_application() throws Throwable {
	    
		lp.openUrl();
	}

	@When("^User enter valid username(.*)$")
	public void user_enter_valid_username(String username) throws Throwable {
	    
		lp.userName(username);
	}

	@When("^User enter valid password(.*)$")
	public void user_enter_valid_password(String password) throws Throwable {
		
		lp.password(password);
	    
	}

	@When("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
	    
		lp.loginButton();
	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	    
		lp.verifyLogin();
	}
	
	@When("^User click on create new account button$")
	public void user_click_on_create_new_account_button() throws Throwable {
	   
	   lp.createNewAccount();
	}

	@Then("^User should be signup successfully$")
	public void user_should_be_signup_successfully() throws Throwable {
	   
		lp.verifySignUp();
	}

 
}
