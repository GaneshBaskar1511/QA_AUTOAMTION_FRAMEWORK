Feature: Form controls

  Scenario: Select days, dropdowns and dates
    Given the automation form is opened
    When I select all days
    And I select India, Blue and Cat from the dropdowns
    And I enter the required dates
    Then I submit the form
