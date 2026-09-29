Feature: New Tab Handling

  Scenario: Open and close a new tab
    Given I open the Automation Testing Practice website
    When I click the New Tab button
    Then a new tab should be opened
    When I switch to the new tab
    Then the new tab should be displayed
    When I close the new tab
    Then I should return to the main tab