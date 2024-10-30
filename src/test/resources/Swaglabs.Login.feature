@Functional
Feature: Swaglabs login testing
Description: User should already have an account in swaglabs
#Background:
@TC1 @Smoke @regression
Scenario Outline: As a swaglabs user, I want to login my swaglabs site with valid credentials,
so that I can use my bank website

Given Open the browser
And Pass the URL "<URL>"

When Enter the username "<username>"
And Enter the password "<password>"
And Click the login button
And Click the menu bar

Then Validate login is successful

Given Quit all browser

Examples:
|URL											 |username 		 |password			|
|https://www.saucedemo.com/|standard_user| secret_sauce |
 
 
 
@Regression
Scenario Outline: As a user , I want to see error message while trying to login with only email no password,
so that my account protected

Given Open the browser
And Pass the URL "<URL>"

When Enter the username "<username>"
And Click the login button

Then Validate error message is displyed

Given Quit all browser

Examples:
|URL											 |username 		 |
|https://www.saucedemo.com/|standard_user|

