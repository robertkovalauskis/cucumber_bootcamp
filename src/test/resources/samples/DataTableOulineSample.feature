Feature: Data Table and Scenatio Outline

  Scenario Outline: Outline with Data Table
    Given I search on amazon for '<item>'
    When I selects filters:
#in map: Key          Value
      | <f1_name> | <f1_value> |
      | <f2_name> | <f2_value> |
    Then I should see '<result>'
    Examples:
      | item | f1_name   | f1_value | f2_name     | f2_value  | result             |
      | book | Condition | New      | Book Format | Hardcover | The Magnolia Story |
      | toys | Game Type | Action   | Brand       | Ideal     | Potato Electronic  |
