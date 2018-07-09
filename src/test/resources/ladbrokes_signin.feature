Feature: ladbrokes signin

  Background:
    Given I enter url as "https://sports.ladbrokes.com/en-gb/"

  @lad_signin
  Scenario: sign in with valid details
    Given I enter username as "lilymedford" in ladbrokes
    Given i enter a password as "A1234567" in ladbrokes
    When I click login in ladborkes
    Then I should see "Deposit" in ladbrokes

