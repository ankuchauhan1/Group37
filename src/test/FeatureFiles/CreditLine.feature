Feature: CreditLine screen for setting up the CreditLine features.

  @CreditLineScreenValidData @Regression
  Scenario: CreditLine screen
    Given User is logged in to DLUI application & select Bank
    When User navigates to Credit Line screen
    Then Input all required fields on the Credit Line screen

  @CreditLineScreenInvalidData @Regression
  Scenario: CreditLine screen with invalid data
    Given User is logged in to DLUI application & select Bank
    When User navigates to Credit Line screen
    Then Input all required fields with incorrect data on the Credit Line screen