Feature: After login entering the mandatory details
Scenario: Entering the mandatory fields
Given user in landing page
When user selecting the location dd
And user selecting the Hotel dd
And user selecting the Room type dd
And user selecting the No of rooms dd
And user entering  the check in date 
And user entering the check out date
And user selecting the Adults per room dd
And user selecting the Childs per room dd
And user selecting the Hotel
And user selecting the Hotel
And user clicking the search button
Then user should navigate to next landing grid



