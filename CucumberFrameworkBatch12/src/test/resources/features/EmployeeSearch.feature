Feature: US-12345 - Search an employee in HRMS
  Background:  Given user is navigated HRMS app
    When user enters valid admin credentials
    And user clicks on login button
    And user navigated to employee list page


  Scenario: Search an employee by id

    When user enters valid employee id
    And user clicks on search button
    Then user is able to see employee information



  Scenario: Search an employee by name

    When user enters valid employee name
    And user clicks on search button
    Then user is able to see employee information