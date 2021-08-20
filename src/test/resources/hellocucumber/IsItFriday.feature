Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario: Sunday isn't Friday
    Given Today is "Friday"
    When I ask whether it's Friday yet
    Then I should be told "Yeah"

  Scenario: Friday is Friday
    Given Today is "Sunday"
    When I ask whether it's Friday yet
    Then I should be told "Nope"

  Scenario: Today is Friday
    Given Today
    When I ask whether it's Friday yet
    Then I should be told "Yeah"

  Scenario Outline: Today is or is not Friday
    Given Today is "<day>"
    When I ask whether it's Friday yet
    Then I should be told "<answer>"

    Examples:
      | day            | answer |
      | Friday         | Yeah   |
      | Sunday         | Nope   |
      | anything else! | Nope   |