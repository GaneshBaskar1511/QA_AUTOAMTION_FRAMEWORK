Feature: Handling Alerts

  Scenario: Handle simple alert
    Given I open the Automation Testing Practice website
    When I click the Simple Alert button
    Then I should get a simple alert
    And I accept the simple alert

  Scenario: Handle confirm alert
    Given I open the Automation Testing Practice website
    When I click the Confirm Alert button
    Then I should get a confirm alert
    And I accept the confirm alert

  Scenario: Handle prompt alert
    Given I open the Automation Testing Practice website
    When I click the Prompt Alert button
    Then I should get a prompt alert
    When I enter "Subiksha" in the prompt alert
    And I accept the prompt alert
    Then the prompt result should be displayed