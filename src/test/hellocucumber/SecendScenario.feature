Feature: Is it Friday yet? part2
  Everybody wants to know when it's Friday

  @Day @Saturday
  Scenario: Saturday isn't Friday
    Given Today is "Saturday"
    When I ask whether it's Friday yet
    Then I should be told "Nope"

  @Day @Thursday
  Scenario: Thursday is Friday
    Given Today is "Thursday"
    When I ask whether it's Friday yet
    Then I should be told "Nope"

  @Day @Monday
  Scenario: Monday is Friday
    Given Today is "Monday"
    When I ask whether it's Friday yet
    Then I should be told "Nope"

  @Day @Examples
  Scenario Outline: Today is or is not Friday
    Given Today is "<day>"
    When I ask whether it's Friday yet
    Then I should be told "<answer>"

    Examples:
      | day            | answer |
      | Weekend        | Nope   |
      | Holiday        | Nope   |
      | Thursday       | Nope   |