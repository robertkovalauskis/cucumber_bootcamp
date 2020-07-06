Feature: Add user and confirm login successful
  Background:
    Given I'm on Add user Page

  Scenario: Add user and check login
    When I add username 'qwerty' and password 'testAA'
    And Click save button
    Then username and password appeared on page

    Scenario: Check login
      When I click on 'Login'
      And Add username and password
      And Click Test Login
      Then message '**Successful Login**' appeared
