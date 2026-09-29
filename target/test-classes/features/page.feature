Feature: Page Components

  Scenario: Select days, country, colors and dates
    Given I open the Automation Testing Practice website
    When I select Sunday Monday and Friday
    And I select "India" from the Country dropdown
    And I select Red and Blue colors
    And I enter "09/23/2026" in Date Picker 1
    And I select day "23" from Date Picker 2
    And I enter "24-09-2026" as the start date
    And I enter "30-09-2026" as the end date
    And I click the Submit button
    Then the result should be displayed