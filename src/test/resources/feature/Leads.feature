Feature: Leads Page

  Scenario: Create New Lead
    Given User is on sign in page
    When User enter valid username and valid password
    And User clicks on sign in button
    And User is on Dashboard page
    And User click on New Lead button
    And User input first name
    And User input last name
    And User input company name
    And User input email
    And User click on Opt in for Mass Emails
    And User input phone number
    And User input extension number
    And User click on Event Style
    And User click on Date box
    And User enters Date in Calendar box
    And User input Start Time
    And User input End Time
    And User input Nature of Event
    And User input number of guests
    And User select source from Lead Source dropdown
    And User select source from Referred By
    And User select source from Owner
    And User click on + Add A Manager
    And User click on Create button
    Then User should see the new lead successfully created on Leads page



