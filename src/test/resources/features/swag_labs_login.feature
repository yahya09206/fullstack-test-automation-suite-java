Feature: Logging into swag labs web app
  As a user
  I should be able to login to swag labs web app

  Scenario Outline: Login with valid credentials

    # data table for multiple users
    Given user is at swab labs login page
    When user uses username "<email>" and passcode "<password>"
    Examples:
      | email         | password     |
      | standard_user | secret_sauce |
    Then Then we should see all orders page

