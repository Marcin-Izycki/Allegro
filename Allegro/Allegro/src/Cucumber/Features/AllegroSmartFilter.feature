Feature: Allegro smart filter
  Scenario: user can search auction with smart
    Given on open browser with allegro.pl
    When user search product named koszula
    Then user select in filter Allegro Smart
    And checkbox with Allegro Smart is selected
    And Close browser