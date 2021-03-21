package stepDefinition;

import com.practice0221.seleniumTest.LoginPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Steps {

	@Given("launch browser and open URL")
	public void launch_browser_and_open_url() {
		LoginPage.Launch();
	}

	@When("^user enters \"([^\"]*)\" & \"([^\"]*)\"$")
	public void user_enters(String arg1, String arg2) throws Throwable {
	    
	    LoginPage.login(arg1, arg2);
	}
		
	   
	


	@Then("user is logged in system")
	public void user_is_logged_in_system() {
		LoginPage.verifyTitle();
		
	}

	
}
