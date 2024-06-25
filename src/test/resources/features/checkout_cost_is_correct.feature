@swag_labs
Feature: Total Item cost is accurate at checkout

  As a customer of the Swag Labs website
  I want the total cost of any items at checkout to be accurate
  So that I am not overcharged (or undercharged) for the items I purchase

  Scenario: Total cost on the checkout page is correct
    Given I log in as a standard user
    When I add multiple items to the cart
    Then the total price at checkout is Item total: $25.98 excluding tax
    And I log out of the service