Feature: get quote

  Background:
    Given I enter url "https://www.d3dsecurity.co.uk/register/"

  @d3d
  Scenario: valid details
    Given I enter first name as "test" in security site
    Given I enter last name as "case" in security site
    Given I enter email id as "test123@yahoo.com" in security site
    Given I enter phone number as "1234567890" in security site
    Given I enter subject as "get quote" in security site
    Given I enter message as "quote me happy" in security site
#    Given I enter captcha code as "shown on screen" in seciruty site
    When I click send message button in security site
    Then I should get an error message as "Your entered code is incorrect." in security site


#    .//*[@id='wpc_5b2df58f06107']/div/div/div/div/div/h2