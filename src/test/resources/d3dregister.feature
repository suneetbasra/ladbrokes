Feature: d3d_register

  Background:
    Given I enter url as "https://www.d3dsecurity.co.uk/register/"

    @d3d_register
    Scenario: register with valid details
      Given I enter first name as "bob" in d3d security site
      Given I enter last name as "marley" in d3d security site
      Given I enter a valid email id as "testme@yahoo.com" in d3d security site
      Given I enter a password as "abc321" in d3d security site
      Given I enter a confirm password as "abc321" in d3d security site
      When I click register button in d3d security site
#      Then I should see "My Account" in d3d security site

#    .//*[@id='post-2603']/h1