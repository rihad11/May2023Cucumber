Feature: login feature

  Background:
    Given user in login page

  @regression
  @smoke
  Scenario: test login 1
    When user enters username and password
    And  user click submit
    Then user successfully login


  @smoke
  Scenario: test login 2
    When user enters "expertAutomation" and "nbmzbncm"
    And  user click submit
    Then user successfully login



    @smoke
  Scenario Outline: test login 3 with ddt
    When user enters "<username>" and "<password>"
    And  user click submit
    Then user successfully login

      Examples:
        | username | password |
        | myexpert | jhbdgllk |
        | Alphae   | gsgdfgsf |