@swag_labs
Feature: Swag Labs Merchandise website

  Swag Labs website - https://www.saucedemo.com/v1/index.html

  As a customer of the Swag Labs website
  I want to be able to complete a full end-to-end journey
  So that I can complete an order

  # Reason for specific scenario: This is a complete end-to-end test of the entire service. It will be useful to identify if each part of the service is working as intended.
  # This could also be used as a smoke test for immediate feedback about the state of the service.

  # Expected outcomes: I am able to complete the following steps in the journey:
  # - Sign in as a valid user
  # - See a list of all available products
  # - Add any or all of those products to the cart
  # - View the cart and if needed, remove any unwanted items
  # - Proceed to enter my personal information
  # - View the checkout to ensure correct products are listed with the correct pricing
  # - Finish the order

  Scenario: I am able to successfully complete an order
    Given I log in as a standard user
    When I add an item to the cart and proceed to checkout
    Then I am able to purchase that item
    And I log out of the service