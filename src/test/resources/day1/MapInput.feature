Feature: Testing pass input with data table using Map

  @MapTest
  Scenario: Populate Name and Comment using Map
    Given  I'm on Ajax Form page
    When I add
      | name     | Ariel           |
      | comment | please add this |
    And Click on Submit button
    Then I see 'Form submited Successfully!' message