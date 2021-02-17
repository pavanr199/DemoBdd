Feature: to test the login functionality

  Scenario Outline: check login is successfull with valid credentialls
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to homepage

    Examples: 
      | username | password |
      | racha    |    12345 |
      | pavan    |    12345 |
