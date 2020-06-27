Feature: Input from test

  Scenario: Pass string and integer
    Given Im on  page
    When I add First Name 'Boris'
    And Last Name 'White'
    And add Age 99
    Then I able submit form


    #Data Tables as List and Map
  Scenario: Pass List<> of strings
    Given Im on  page
    When I have list of names:
      | Ariel    |
      | Maria    |
      | Gorohina |
    Then I able submit form


  Scenario: Pass Map<Key,Value>
    Given Im on  page
    When I add data:
      | name      | Roza   |
      | last Name | Jonson |
      | age       | 66     |
    Then I able submit form