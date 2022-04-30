Feature: US-12345 - Search an employee in HRMS
  Background:  Given user is navigated HRMS app
    When user enters valid admin credentials
    And user clicks on login button
    And user navigated to employee list page


  Scenario: Search an employee by id
   #Given user is navigated HRMS app
    #hen user enters valid admin credentials
   #And user clicks on login button
   #And user navigated to employee list page
    When user enters valid employee id
    And user clicks on search button
    Then user is able to see employee information
    When user enters valid employee name


  Scenario: Search an employee by name
    #Given user is navigated to HRMS application
   #When user enters valid admin credentials
   #And user clicks on login button
   #And user navigated to employee list page
    When user enters valid employee name
    And user clicks on search button
    Then user is able to see employee information
