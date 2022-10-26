Feature: Login in to Orange hrm
Scenario: Login scenario
Given user navigate to login page
When user enter below credentials 
|Admin|admin123|
And clicks the login button
Then  user navigate to home page