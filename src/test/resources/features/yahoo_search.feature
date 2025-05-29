@ui
Feature: Google search page

  As a user,
  I should be able to search by keyword
  and get my result

  Background:
    Given user is at the homepage

  @wip
  Scenario: User searches by keyword
    Given user is at the homepage
    When user searches for keyword "selenium"
    Then we should see the results page
    And and the title should start with "selenium"

#  @wip2
#  Scenario: User searches by keyword java
##    Given user is at the homepage
#    When user searches for keyword "java"
#    And and the title should start with "java"