Feature: Testing address book website

  Background:
    Given open 'http://a.testaddressbook.com/'
    When click sing in
    When enter login 'autotester@gmail.com' and password 'qwertytest'
    When sing in once more

  @SignOutTest
  Scenario: : Sign out test
    Then sing out

  @CreatingNewAddresses
  Scenario Outline: add addresses
    Given click on new addresses
    When add new Address
    And enter '<First name>', '<Last name>', '<Address>' and the '<City>' in the form
    Then click Create Address
#    Then verify First name
#    And return to Addresses
#    And verify address on page

    Examples:
      | First name | Last name   | Address              | City      |
      | John       | Doe         | Rose Street 10-14    | New York  |
      | Robert     | Kovalauskis | Journal Street 30-36 | Vancouver |
      | Peter      | Michaels    | Jhoann Street 90-12  | Berlin    |

  @DestroyAddressTest
  Scenario: destroy one address
    When destroy one address
    Then verify address removed from page
