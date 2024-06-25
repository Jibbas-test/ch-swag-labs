@swag_labs
Feature: Appropriate error validation appears on the sign in page

  As a user of the Swag Labs website
  I want an appropriate error message to be displayed if I enter an incorrect username or password
  So that I can understand why I am unable to sign in

  Scenario: Error validation messages appear when providing incorrect username and password
    Given I have navigated to the Swag Labs sign in page
    When I enter an invalid username and password
    Then I am shown appropriate error messages