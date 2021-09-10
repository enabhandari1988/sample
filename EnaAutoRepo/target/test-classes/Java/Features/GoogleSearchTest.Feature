
Feature: Test Example for Google

  Scenario: Search for your favourite singer
    Given I navigate to google search
    When I search for favourite singer Adele
    Then I see there is a search result with Singer name