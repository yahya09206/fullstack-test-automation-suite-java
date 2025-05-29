@ui @Library-Login
Feature: Logging into library app
  As a user
  I should be able to login to library app

  Scenario Outline: Login with valid credentials

    # data table for multiple users
    Given user is at library login page
    When user uses username "<email>" and passcode "<password>"
    Then user should be at dashboard page
    Examples:
      | email            | password    |
      | student2@library | libraryUser |
      | student3@library | libraryUser |
      | student4@library | libraryUser |
      | student5@library | libraryUser |