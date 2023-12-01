Feature: CreditLine screen for setting up the CreditLine features.

  @CreditLineScreen @Regression
  Scenario: CreditLine screen
    Given User is logged in to DLUI application & select Bank
    When User navigates to Credit Line screen
    Then Input all required fields on the Credit Line screen