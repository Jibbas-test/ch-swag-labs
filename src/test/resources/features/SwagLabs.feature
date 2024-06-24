@swaglabs
Feature: Swag Labs Merchandise website

  Swag Labs website - https://www.saucedemo.com/v1/index.html

  As a customer of the Swag Labs website
  I want to be able to sign in
  So that I can carry out any purchases that I may need

  Scenario: Sign in to Swag Labs
    Given I have navigated to the Swag Labs sign in page
    And I sign in as a standard user
    When I add an item to the cart
    And I click on the cart button
    And I click on the checkout button
    And I enter name details
    And I click the continue button
    And I click on the finish button
    And I close browser