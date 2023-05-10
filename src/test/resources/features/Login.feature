Feature: Login to the application
Scenario: User with valid username and password

Given User is standing in UI of application
When  User entered the valid username 
And   User entered the valid password
And   User clicking the login 
Then  User is navigated to landing page

