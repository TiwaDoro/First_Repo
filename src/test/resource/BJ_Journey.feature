
Feature: As a user,
I want to be able to book 
my jet and see a confirmation.

Background: Login
Given am on the Landing Page 
When I enter my username and password
And I click Login button
Then I click the book your jet tab


@ninja_testers
Scenario: BJ_Journey
Given I enter my start destination
And I enter my end destination
And I select a zone
When I click the relevant check box
And I select no radio button 
And I click on submit button
Then a successfull confirmation message is displayed
And I click other things
