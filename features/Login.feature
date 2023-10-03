Feature: Login

  Scenario: successful login with valid credentials
    Given User Launch The Chrome Browser
    When User Open URL "http:www.google.com/"
    Then Page Title should be "Google"
    And Close the Browser