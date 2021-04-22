Feature: Cloths - Men functionality testing
  @Testing

#TestCase1
  Scenario: Navigating to Cloths Men page from Home page
    Given User is on the homepage
    And Navigate to Men page
    And Home Cloths Men header is dispalyed
    And Men - product header is displayed
    And Filter By option is displayed in Men clothes page
    Then User verified the Clothes Men page