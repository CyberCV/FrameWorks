Feature: Adding the employee in HRMS Application


  Scenario: Adding one employoee from file
    Given user is navigated to HRMS application
    When user enters valid admin credentials
    And user clicks on login button
    When user clicks on PIM option
    And user clicks on add employee option
    And user enters firstname middlename and lastname
    And user clicks on save button
    Then employee added successfully

