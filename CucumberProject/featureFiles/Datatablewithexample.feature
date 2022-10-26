Feature: Login feature for Orange HRM
Scenario Outline: Login scenario with Example
Given proceed to login page
When user enters "<Username>" and "<Password>" 
And clicks login

Examples:
|Username |Password |
|Admin |admin123 |
|Admin|admin1234|