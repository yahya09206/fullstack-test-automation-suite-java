Feature: Demonstrating the data table feature of cucumber

  Cucumber provides the ability to organize repeating steps with different data
  using the data table feature and automatically convert the table into
  few known data types supported by cucumber

  Scenario: Petting zoo
    Given I have a "horse"
    And I have a "dog"
    And I have a "turtle"
    And I have a "zebra"
    When I call their names
    Then They come to me


  Scenario: Petting zoo with table
    Given I have the following animals
      | horse  |
      | dog    |
      | turtle |
      | zebra  |
    When I call their names with below names
      | Kira    |
      | Doru    |
      | Tito    |
      | Zemfira |
    Then They come to me



  Scenario: Login to weborder app by providing username and password in a 2 column table
    Given we are at web order login page
    When we provide below credentials
      | username | Tester |
      | password | test   |
    Then we should see all orders page
