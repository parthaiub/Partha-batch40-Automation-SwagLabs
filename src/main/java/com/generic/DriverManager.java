package com.generic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	

	
	public WebDriver getFirfoxDriver(WebDriver driver) {
	
		WebDriverManager.firefoxdriver().setup();
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
	return driver;
	}
	
	
	
	public WebDriver getChromeDriver(WebDriver driver) {
	
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		
	return driver;
	}



	public WebDriver getFirefoxDriver() {
		// TODO Auto-generated method stub
		return null;
	}
	
	}

