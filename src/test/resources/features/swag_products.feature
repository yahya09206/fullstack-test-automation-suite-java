Feature: Viewing swag labs products page
  As a user
  I should be able to view all of the items on the products page

  Scenario: View all products
    Given I'm at the products page
    When I view all of the items
    Then I should see "9" items