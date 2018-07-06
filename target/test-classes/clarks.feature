Feature: clarks

  Background:
    Given I enter url as "https://www.clarks.co.uk/"

    @clarks
    Scenario: find size 8 black shoes in sal
      When I click sale
      When I click shop mens
      When I click size eight
      When I click colour
      When I click black
#      todo
      Then I should see "45 STYLES FOUND" on clarks website
#      Then I should see some thing
#      Then I should see something
#      Then I should see something
      
