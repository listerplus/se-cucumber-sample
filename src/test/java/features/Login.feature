Feature: This test suite contains Login Tests

  Background:
    Given User is on login page

  Scenario Outline: A. Login with invalid credentials
    When User enters incorrect <username> <password>
    Then Error message prompted

    Examples:
    | username | password |
    | 'test'   | 'test '  |

  Scenario: B. Login with valid credentials
    When User enters correct credentials
    Then User is directed to homepage
