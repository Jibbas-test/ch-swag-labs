@swag_labs
Feature: Able to add to basket from individual product page

  As a customer of the Swag Labs Merchandise website
  I want to be able to add an item to the cart from the individual product page
  So that I can make a purchase

  Scenario: I am able to add an item to the cart from the individual product page
    Given I log in as a standard user
    When I click on the onesie product link
    And I click on the onesie add to cart button
    Then the onesie is added to the cart
    And I log out of the service