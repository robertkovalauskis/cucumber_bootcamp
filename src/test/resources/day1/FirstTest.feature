@TestFeature
Feature: First Test in cucumber

  @TestScenario1
  Scenario: First test
    Given open site HeroKuapp
    When I click Add button
    Then button Delete added

  @TestScenario2
    Scenario: Second test
      Given open site Selenium Beginner Guide
      When I click Chapter2 button
      Then Button With Name added


