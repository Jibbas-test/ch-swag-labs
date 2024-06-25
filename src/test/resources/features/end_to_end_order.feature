@swag_labs
Feature: Swag Labs Merchandise website

  Swag Labs website - https://www.saucedemo.com/v1/index.html

  As a customer of the Swag Labs website
  I want to be able to sign in
  So that I can carry out any purchases that I may need

  Scenario: I am able to successfully complete an order
    Given I log in as a standard user
    When I add an item to the cart and proceed to checkout
    Then I am able to purchase that item
    And I log out of the service
