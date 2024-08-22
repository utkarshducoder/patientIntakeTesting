Feature: Interaction with Demography form

  Scenario: User verifies demography details and continues
    Given the user is on the demography page with heading as "DEMOGRAPHICS"
    Then the user verifies firstname as "Danette"
    And the user verifies lastname as "Sigler"
    And the user verifies date of birth as "07/21/1965"
    When the user clicks on the continue button
    #Then the user should be navigated to the next page
