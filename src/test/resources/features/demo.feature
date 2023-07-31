Feature: login feature

  @regression
  @smoke
  Scenario: test login 1
    Given user in login page
    When user enters username and password
    And  user click submit
    Then user successfully login

    @smoke
  Scenario: test login 2
    Given user in login page
    When user enters "experAuto@gmail.com" and "Abc!234"
    And  user click submit
    Then user successfully login
