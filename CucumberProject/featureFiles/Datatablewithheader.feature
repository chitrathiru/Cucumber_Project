Feature: Login in to Orange hrm with header
Scenario: Login scenario with header
Given user navigate to login page with header
When user enter below credentials with header
|Username|Password|
|Admin|admin123|
And clicks the login button with header
Then  user navigate to home page with header