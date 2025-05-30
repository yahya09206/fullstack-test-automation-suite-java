Feature: Web order app login
  As a user
  I should be able to login to web order app

  # Put repeating @Given code here
  Background:
    Given we are at web order login page

  Scenario: User logs in successfully
    #Given we are at web order login page
    When we provide valid credentials
    Then we should see all orders page

  Scenario: User login fail
    #Given we are at web order login page
    When we provide invalid credentials
    Then we should still be at login page
    And login error message should be displayed

  @failed
  Scenario: User login with specific credentials
    When user provide username "Testers" and password "test"
    Then we should see all orders page