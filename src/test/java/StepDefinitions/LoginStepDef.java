package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.io.IOException;

import PageOperations.LoginOperations;

public class LoginStepDef {
	
	LoginOperations loginOperations;
	
	public LoginStepDef() {
	
	loginOperations = new LoginOperations();
	}
	
	
	@Given("Launch application")
	public void launch_application() {
		loginOperations.launchApplication();
	    
	}

	@And("Enter credentials")
	public void enter_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("Click on Login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("Verify data")
	public void verify_data() throws IOException {
		loginOperations.data();
	}

}
