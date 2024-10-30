package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	//Handle the nullpointer exception
	public MasterPageFactory (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//*[@id='user-name']")
	private WebElement username;

	@FindBy(xpath="//*[@type='password']")
	private WebElement password;
	
	
	@FindBy(xpath="//*[@id='login-button']")
	private WebElement loginbutton;
	
	@FindBy(xpath="//*[@id='react-burger-menu-btn']")
	private WebElement menubutton;
	
	@FindBy(xpath="//*[@id='logout_sidebar_link']")
	private WebElement logoutbutton;
	
	
	@FindBy(xpath="//*[@class='error-message-container error']")
	private WebElement erromessage;

	
	
	
	
	

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public WebElement getMenubutton() {
		return menubutton;
	}

	public WebElement getLogoutbutton() {
		return logoutbutton;

		
	}
		


	public WebElement getErromessage() {
		return erromessage;
	}
	
	
	
	
	
	
	
	//*[@class='error-message-container error']
	
	
	
	//*[@id='login-button']
	
	
	//*[@id='user-name']
	
	
	//*[@type='password']
	//*[@name='password']
}
