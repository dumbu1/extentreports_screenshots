package stepDefinations;

import commonMethods.SpecificToSelenium;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.LoginPage;
import pages.LoginSuccessPage;
import utility.InvokeBrowser;

public class LoginPage_SD {
	
	@When("user enters {string} as username and {string} as password and clicks on {string} button")
	public void user_enters_as_username_and_as_password_and_clicks_on_button(String username, String password, String buttonText) {
		pages.LoginPage obj_LoginPage=new pages.LoginPage(InvokeBrowser.getDriver());
		  obj_LoginPage.EnterLoginCredentials(username, password);
	}
	
	
	@Then("system should display {string} message;")
	public void system_should_display_message(String extectedText) {
		SpecificToSelenium.switch_To_Current_Window(InvokeBrowser.getDriver());
	    LoginSuccessPage obj_LoginSuccessPage=new LoginSuccessPage(InvokeBrowser.getDriver());
	    obj_LoginSuccessPage.login_Checking(extectedText);
	}

	
	@When("user clicks on {string} link")
	public void user_clicks_on_link(String linkText) {
		HomePage obj_HomePage=new HomePage(InvokeBrowser.getDriver());
		obj_HomePage.click_LoginForm();
	}
	@Then("system should open {string} page")
	public void system_should_open_page(String pageTitle) {
	    SpecificToSelenium.validate_PageTitle(InvokeBrowser.getDriver(), pageTitle);
	}
	
	
	
	
}
