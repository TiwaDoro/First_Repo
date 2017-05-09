Feature: As a user 
I want to be able to filling
the trade your jet form and submit

@ninja_testers
Scenario: Trade Your Jet
Given am on the Landing Page 
And I enter my username and password
And I click Login button
When I click the trade your jet tab
And I enter current jet price
And I enter purchase price
And I enter flight time
And I select the relevant radio button
And Click submit
Then I should see a successfully message 
