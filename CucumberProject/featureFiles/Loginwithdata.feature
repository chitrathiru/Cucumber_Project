Feature: Login in to Orange hrm
Scenario: Login with correct credentials
Given user is on the login page
When user enter valid credentials "Admin" and "admin123"
And user clicks the login button
Then the user should be able to navigate to home page