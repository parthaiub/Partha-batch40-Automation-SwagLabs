package com.stepdef;


import org.openqa.selenium.WebDriver;


import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.generic.DriverManager;
import com.pagefactory.MasterPageFactory;
public class StepdefSwaglabsLogin {
	
	WebDriver driver;
	
	MasterPageFactory mpf;
	
	

	
	@Given("Open the browser")
	public void open_the_browser() {
	    
	    DriverManager dm =new DriverManager();
	    driver= dm.getFirfoxDriver(driver);
	    
	}

	@Given("Pass the URL {string}")
	public void pass_the_url(String URL) {
	    driver.navigate().to(URL);
	    
	}

	
	
	@When("Enter the username {string}")
	public void enter_the_username(String username) {
	    mpf= new MasterPageFactory(driver);
	    mpf.getUsername().sendKeys(username);
	}

	@When("Enter the password {string}")
	public void enter_the_password(String password) {
	    
	    mpf.getPassword().sendKeys(password);
	}
	
	
	@When("Click the login button")
	public void click_the_login_button() {
	    mpf.getLoginbutton().click();
	    
	}
	
	@When("Click the menu bar")
	public void click_the_menu_bar() {
	   mpf.getMenubutton().click();
	}

	

	@Then("Validate login is successful")
	public void validate_login_is_successful() {
	    
	Assert.assertTrue(mpf.getLogoutbutton().isDisplayed(), "Login is successfull");
	
		
	if (mpf.getLogoutbutton().isDisplayed()) {
		System.out.println("login successful");
	} else{
		System.out.println("Login failed");
		
	}}
		
	
	   
	@Given("Quit all browser")
	public void tearDown() {
	   driver.quit();
}

@Then("Validate error message is displyed")
public void validate_error_message_is_displyed() {
    Assert.assertTrue(mpf.getErromessage().isDisplayed(), "Password is required" );

}


@When("Click logout button")
public void click_logout_button() {
  mpf.getLogoutbutton().click();
}


@Then("Validate logout is successful")
public void getSLlogout_is_successful() {
	SoftAssert sa =new SoftAssert();
	sa.assertTrue(mpf.getLoginbutton().isDisplayed(), "Logout is successful");
}}






