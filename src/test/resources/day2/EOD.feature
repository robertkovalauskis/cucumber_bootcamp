Feature: Testing address book website

  Background:
    Given open 'http://a.testaddressbook.com/'
    When click sing in

  Scenario: sign in
    When click sing up
    And populate it and remember this
    Then sing out

  Scenario Outline: add addresses                 // REPEAT 3 TIMES
    When add data from previous test
    And add data from previous test
    And click 'Addresses'
    And click new Address
    And populate form
    And click Create Address
    And verify address added
    And click List
    Then verify address on page

    Examples:
      |  |

  Scenario: destory one address
    When sing in
    Then destroy one address
    And verify address removed from page
