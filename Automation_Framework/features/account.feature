Feature: Account details
  As a user
  I want to enter account details
  So that I can complete the form

  Scenario: Enter valid account details
    Given the automation form is opened
    When I enter valid account details
    Then the female gender should be selected
