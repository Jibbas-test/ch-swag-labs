@swag_labs
Feature: Able to add to basket from individual product page

  As a customer of the Swag Labs Merchandise website
  I want to be able to add an item to the cart from the individual product page
  So that I can make a purchase

  # Reason for specific scenario: There are currently two different ways in which a user can add an item to the cart, via the 'all products' page
  # or from the individual product information page.  This is to ensure that both 'Add to Cart' options function as intended.Scenario:

  # Expected outcome: User is successfully able to add an item to the cart from the individual product page.

  Scenario: I am able to add an item to the cart from the individual product page
    Given I log in as a standard user
    When I click on the onesie product link
    And I click on the onesie add to cart button
    Then the onesie is added to the cart
    And I log out of the service