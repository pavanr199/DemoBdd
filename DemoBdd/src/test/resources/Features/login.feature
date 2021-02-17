Feature: feature to test login functionality



  Scenario: check login is success with valid credentialls
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to homepage
