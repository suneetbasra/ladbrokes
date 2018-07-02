Feature: easyjet registration

  Background:
    Given I enter url "https://www.easyjet.com/en/register"

  @register1
  Scenario: regitering with valid details
    Given I enter a valid email id as "test123@yahoo.com"
    Given I enter confirm a valid email id as "test123@yahoo.com"
    Given I enter a valid password with no specail characters as "abcdef"
    Given I enter confirm a valid password characters with no specail characters as "abcdef"
    Given I enter title as "title"
    Given I enter first name as "test"
    Given I enter surname as "case"
    Given I enter address as "1 reading street"
    Given I enter address continue as "calcot"
    Given I enter town/city as "reading"
    Given I enter postcode/zip as "rg317yy"
    Given I enter country from dropdown menu as "bra"
    Given I enter mobile telephone code as "+44"
    Given I enter mobile number as "123456789"
    Given I enter Yes, i do wish to receive updates as "Tick/Notick"
#    When I press Register now button
#    Then I should be able to register

  @register
  Scenario Outline: registering with invalid details
    Given i enter email id as "<email>"
    Given i enter confirm email id as "<confirm_email>"
    Given i enter a password as "<password>"
    Given i enter a confirm password as "<confirm_password>"
    Given I enter title as "Mr"
    Given I enter first name as "test"
    Given i enter last name as "case"
    Given I enter address as "<address>"
    Given I enter address continue as "<address_continue>"
    Given I enter town/city as "<town_city>"
    Given I enter postcode/zip as "<postcode_zip>"
    Given I enter country from dropdown menu as "BRA"
    Given i enter mobile telephone as "<telephone>"
    Given I enter Yes, i do wish to receive updates as "Tick/untick"
    When I press Register now button
    Then I should get error message "<errorMessage>"
#add three more steps for *i am most interested in flights departing from*

    Examples:
      | email          | confirm_email    | password | confirm_password | title | address        | address_continue | town_city | postcode_zip | telephone | errorMessage                             |
      | 1234@yahoo.com | 123456@yahoo.com | abc123   | abc123           | Mr    | 1 reading road | calcot           | reading   | rg31         | 123456789 | The email addresses entered do not match |
      | 123@yahoo.com  | 123@yahoo.com    | abc123   | abc123456789     | Mrs   | 1 reading road | calcot           |           | rg31         | 123456789 | Please enter the contact's city          |
      | 123@yahoo.com  |                  | abc123   | abc123           | Miss  | 12             | newbury          | newbury   |              |           | The email addresses entered do not match |
