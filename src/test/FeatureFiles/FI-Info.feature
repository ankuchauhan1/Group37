Feature: FI Info screen for creating the user

  @FI-Info @Regression
Scenario: FI Info Positive flow
Given User has reached to FI Info Screen
And User Enters Client Company Name
And User Enters Institution Name
And User Enters FI Code
And User Enters FI RTN Code
    And User Enters Core DDA System
    And User Enters LOB Code
    And User Enters Processing Group Code
    And User Enters Phone Number1
    And User Enters Phone Number2
    And User Enters Phone Number3
    Then User clicks on Submit Button
And User is able to see successful Data Saved Message



