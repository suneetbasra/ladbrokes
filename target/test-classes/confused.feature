
Feature: confused

  Background:
    Given I enter url as "https://www.confused.com/"

  Scenario: loging with valid details
    Given I click My account
    Given I click Log in
    Given I enter email address as "suneet023@yahoo.com" in confused web
    Given I enter password as "Peugeot1" in confused web
    When I click Login
#    todo
#    Then I should see "Beat your renewal guaranteed" in confused web
#    Then I should see "Retrieve a Quote" in confused web

  @confusedsignin
  Scenario: loging with valid details
    Given I click My1 account
    Given I click Log in
    Given I enter email address as "suneet023@yahoo.com" in confused web
    Given I enter password as "Peugeot1" in confused web
    When I click Login
#    todo
#    Then I should see "Beat your renewal guaranteed" in confused web
#    Then I should see "Retrieve a Quote" in confused web

  @confusedsignin
  Scenario: loging with valid details
    Given I click My account
    Given I click Log in
    Given I enter email address as "suneet023@yahoo.com" in confused web
    Given I enter password as "Peugeot1" in confused web
    When I click Login
#    todo
#    Then I should see "Beat your renewal guaranteed" in confused web
#    Then I should see "Retrieve a Quote" in confused web

  @confusedsignin
  Scenario: loging with valid details
    Given I click My account
    Given I click Log in
    Given I enter email address as "suneet023@yahoo.com" in confused web
    Given I enter password as "Peugeot1" in confused web
    When I click Login
#    todo
#    Then I should see "Beat your renewal guaranteed" in confused web
#    Then I should see "Retrieve a Quote" in confused web

  @confusedsignin
  Scenario: loging with valid details
    Given I click My account
    Given I click Log in
    Given I enter email address as "suneet023@yahoo.com" in confused web
    Given I enter password as "Peugeot1" in confused web
    When I click Login
#    todo
#    Then I should see "Beat your renewal guaranteed" in confused web
#    Then I should see "Retrieve a Quote" in confused web

  @confusedsignin
  Scenario: loging with valid details
    Given I click My account
    Given I click Log in
    Given I enter email address as "suneet023@yahoo.com" in confused web
    Given I enter password as "Peugeot1" in confused web
    When I click Login
#    todo
#    Then I should see "Beat your renewal guaranteed" in confused web
#    Then I should see "Retrieve a Quote" in confused web
  @confusedsignin
  Scenario: loging with valid details
    Given I click My account
    Given I click Log in
    Given I enter email address as "suneet023@yahoo.com" in confused web
    Given I enter password as "Peugeot1" in confused web
    When I click Login
#    todo
#    Then I should see "Beat your renewal guaranteed" in confused web
#    Then I should see "Retrieve a Quote" in confused web

  @confusedsignin
  Scenario: loging with valid details
    Given I click My account
    Given I click Log in
    Given I enter email address as "suneet023@yahoo.com" in confused web
    Given I enter password as "Peugeot1" in confused web
    When I click Login
#    todo
#    Then I should see "Beat your renewal guaranteed" in confused web
#    Then I should see "Retrieve a Quote" in confused web
  @confusedsignin
  Scenario: loging with valid details
    Given I click My account
    Given I click Log in
    Given I enter email address as "suneet023@yahoo.com" in confused web
    Given I enter password as "Peugeot1" in confused web
    When I click Login
#    todo
#    Then I should see "Beat your renewal guaranteed" in confused web
#    Then I should see "Retrieve a Quote" in confused web
  @confusedsignin
  Scenario: loging with valid details
    Given I click My account
    Given I click Log in
    Given I enter email address as "suneet023@yahoo.com" in confused web
    Given I enter password as "Peugeot1" in confused web
    When I click Login
#    todo
#    Then I should see "Beat your renewal guaranteed" in confused web
#    Then I should see "Retrieve a Quote" in confused web

  @confusedsignout
  Scenario: signout
    Given I click My account
    Given I click Log in
    Given I enter email address as "suneet023@yahoo.com" in confused web
    Given I enter password as "Peugeot1" in confused web
    When I click Login
#    Then I should see "Beat your renewal guaranteed" in confused web
    Then I should see "Retrieve a Quote" in confused web
    When I click logout
    Then I should see "Or get the difference, plus £20" in confused web singout




