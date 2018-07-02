Feature: easyjet signing

  Background:
    Given I enter url "https://www.easyjet.com/en"

  @signin
  Scenario: singin
    When I click signing button
    Given I enter username as "test123@yahoo.com"
    Given I enter password as "abcdef"
    When I click signin button
    Then I should see "My bookings"
#    Then I should see "My easyJet holidays bookings"

  @signinerror
  Scenario Outline: sining with invalid details
    When I click signing button
    Given I enter username as "<email>"
    Given I enter password as "<password>"
    When I click signin button
    Then I should get an error message as "<error_message>"

    Examples:
      | email              | password | error_message                                               |
      | test1237@yahoo.com | abcde    | Failed to sign in, please check your details and try again. |
      | test127@yahoo.com  | abcde    | Failed to sign in, please check your details and try again. |




#  /html/body/div[5]/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[2]/form/div[7]/span