Feature: Allegro Multiple Search
  Scenario Outline: user can search for multiple items
    Given on open browser with allegro.pl
    When user click "szukaj wielu"
    And user search product named <firstItem> and <secondItem> and search products
    Then select sorting on trafność: największa
    And check first variant have in name <firstItem>
#    And check second variant have in name <secondItem>
#    Error 403 can't really test allegro.pl
    Examples:
    |firstItem |  |secondItem|
    |Klocki lego   |  |Klocki duplo    |