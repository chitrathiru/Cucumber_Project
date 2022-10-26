Feature: This is to test google search 

Scenario: Google Search 
Given user is entering google.com
When user is typing "california" in search box
And user is pressing the search button
Then user is to see the california related results
