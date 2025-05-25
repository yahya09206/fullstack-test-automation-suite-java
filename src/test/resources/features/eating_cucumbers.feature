Feature: Eating too many cucumbers may not be good for you

  Eating too much of anything may not be good for you

  Scenario: Eating a few is no problem
    Given Alice is hungry
    When she eats 3 cucumbers
    Then she will be full

  Scenario: Eating too many is a problem
    Given Olivia is hungry
    When she eats 10 cucumbers
    Then he will be sick