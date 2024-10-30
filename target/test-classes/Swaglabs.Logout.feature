@Regression
Feature: Swaglabs logout testing
Description: User should have login account
Background: User should be logged in

Scenario Outline: As a logged in user, I want to logout from the swaglabs website,
so that my account information is secured

Given Open the browser
And Pass the URL "<URL>"

When Enter the username "<username>"
And Enter the password "<password>"
And Click the login button
And Click the menu bar
And Click logout button

Then Validate logout is successful
Given Quit all browser


Examples:
|URL											 |username 		 |password			|
|https://www.saucedemo.com/|standard_user| secret_sauce |
 