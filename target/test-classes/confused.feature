
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
    Then I should see "Beat your renewal guaranteed" in confused web
#    Then I should see "Retrieve a Quote" in confused web

  @confusedsignin
  Scenario: loging with valid details
    Given I click My account
    Given I click Log in
    Given I enter email address as "suneet023@yahoo.com" in confused web
    Given I enter password as "Peugeot1" in confused web
    When I click Login
    When I click My account
    When I click saved car adverts
#    todo
    Then I should see "You haven't saved any cars yet!" in confused web

#    Then I should see "Retrieve a Quote" in confused web

