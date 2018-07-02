Feature: moneysupermarket

  Background:
    Given I enter url as "https://www.moneysupermarket.com/"

  @moneysingin
  Scenario: login with valid details
    Given I click login  button in moneyweb
    Given I enter a valid email id as "suneet023@yahoo.com" in moneyweb
    Given I enter a valid password as "peugeot1" in moneyweb
    Given I untick Remember me for 90 days in moneyweb
    When I click signing button in moneyweb
    Then I should see "Welcome back suneetpal" in moneyweb

    @moneyerror
  Scenario Outline: login with invalid details
    Given I click login  button in moneyweb
    Given I enter a valid email id as "<email>" in moneyweb
    Given I enter a valid password as "<password>" in moneyweb
#    Given I untick Remember me for 90 days in moneyweb
    When I click signing button in moneyweb
    Then I should get an error message as "<error>" in moneyweb

    Examples:

      | email               | password |error|
      | suneet023@yahoo.com | Peugeot1 |Looks like this isn't matching the password we have for you - give it another try|
#      | suneet@yahoo.com    | peugeot1 |Oh no, we can't find your email address on our records.                          |







