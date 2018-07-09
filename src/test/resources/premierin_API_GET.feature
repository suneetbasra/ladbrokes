Feature: Verify GET method for Premier inn request


*#  -ve Scenario*
  @api_get
  Scenario: Verify Json Response Invalid End Point
    Given I have end point "https://www.premierinn.com/services/en/mobileHotelLocator/suggestions/"
#    Then I should see response message as "not found"
    Then I should see response code as 404


