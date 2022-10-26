
Feature: Login in to Orange hrm

@positive
Scenario: valid login
Given user is on login page
When user enter valid username and pwd
And user click the login button
Then the user should be navigate to home page

@negative
Scenario: invalid login
Given user is on login page
When user enter valid username and pwd
And user click the login button
Then the user should be navigate to home page