Feature: As a user 
I want to be able to click 
on all the Navigation Pane


Background: Login   #Background is a test that has to run before the main scenario
Given am on the Landing Page 
When I enter my username and password
Then I click Login button

@testcomplete
Scenario: Click trade your jet tab
When I click the trade your jet tab
Then I should be on trade your jet page

@testcomplete
Scenario: Click book your jet
When I click the book your jet tab
Then I should be on book your jet page

@testcomplete
Scenario: Click just trade
When I click the just trade tab
Then I should be on just trade page

@testcomplete
Scenario: Click about us
When I click the about us tab
Then I should be on about us page

@testcomplete
Scenario: Click contact us 
When I click the contact us tab
Then I should be on contact us page
