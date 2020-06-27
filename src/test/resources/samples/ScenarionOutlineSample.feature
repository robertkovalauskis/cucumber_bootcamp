Feature: Outline scenario

  Background:
    Given Im on  page

#  As much lines you have in "Example:"that much tests will be run.
#   2 lines = 2 tests
#  Value can be passed in any place (single value)
  Scenario Outline: Run one test with many entries
    When I login '<user name>' and '<password>'
    Then I able submit form
    Examples:
      | user name | password |
      | alex      | 1234     |
      | kitty     | 0976     |

#    in two different places(single value)
  Scenario Outline: Run one test with many entries
    When I add '<user name>'
    And add '<password>'
    Then I able submit form
    Examples:
      | user name | password |
      | alex      | 1234     |
      | kitty     | 0976     |

#    also scenario outline can accept values as Map<Key, Value>
  Scenario Outline: Run one test with many entries
    When I add :
      | name     | '<user name>' |
      | password | '<password>'  |
    Then I able submit form
    And see '<message>'
#    in Example might uncounted amount of header columns
    Examples:
      | user name | password | message     |
      | alex      | 1234     | hello alex  |
      | kitty     | 0976     | hello kitty |


  Scenario Outline: Run one test with many entries
    When I add :
      | name     | '<user name>' |
      | password | '<password>'  |
      | gender   | '<gender>'    |
    Then I able submit form
    And see '<message>'
#    Also tags can be placed on Example level. Logic the same as for Scenarios or Feature file.
    @Regression
    Examples:
      | user name | password | message     | gender |
      | Alex      | 1234     | hello Alex  | female |
      | Kitty     | 0976     | hello Kitty | male   |
    @Sanity
    Examples:
      | user name | password | message     | gender |
      | Ilze      | 1234     | hello Ilze  | male   |
      | Artur     | 0976     | hello Artur | female |



  Scenario Outline: Run one test with many entries
    When I add :
      | name     | '<user name>' |
      | password | '<password>'  |
      | gender   | '<gender>'    |
    Then I able submit form
    And see '<message>'
#    Also tags can be placed on Example level. Logic the same as for Scenarios or Feature file.
    @Regression
    Examples:
      | user name | password | message     | gender |
      | Alex      | 1234     | hello Alex  | female |
      | Kitty     | 0976     | hello Kitty | male   |
    @Sanity
    Examples:
      | user name | password | message     | gender |
      | Ilze      | 1234     | hello Ilze  | male   |
      | Artur     | 0976     | hello Artur | female |