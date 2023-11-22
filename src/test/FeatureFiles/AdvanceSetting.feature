Feature: Advance Setting screen for setting up the advance features.

  @AdvanceSetting @Regression
  Scenario: Scripting advance setting screen

    Given User is logged in to DLUI application
    When User navigates to Advance Setting screen
    Then Input all required fields on the Advance Settings screen