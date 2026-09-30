Feature: File Upload

  Scenario: Upload a single file
    Given I open the Automation Testing Practice website
    When I select the single file
    And I click Upload Single File
    Then the single file should be uploaded successfully

  Scenario: Upload multiple files
    Given I open the Automation Testing Practice website
    When I select two files
    And I click Upload Multiple Files
    Then the multiple files should be uploaded successfully