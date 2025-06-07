@swag
Feature: Logging into swag labs web app
  As a user
  I should be able to login to swag labs web app

  Scenario Outline: Login with valid credentials

    # data table for multiple users logging into swag lab demo app
    Given user is at swab labs login page
    When user enters username "<email>" and passcode "<password>"
    Then Then we should see all orders page
    Examples:
      | email         | password     |
      | standard_user | secret_sauce |

