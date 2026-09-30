Feature: Account Information

  Scenario: Enter personal information
    Given I open the Automation Testing Practice website
    When I enter "Jeya" in the Name field
    And I enter "jeya@gmail.com" in the Email field
    And I enter "No 66/1 Arani Rangan Street" in the Address field
    And I select "Female" gender
    Then the personal information should be entered successfully