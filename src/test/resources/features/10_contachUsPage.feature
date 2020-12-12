Feature: Amazon Contact Us Page detail
  This Feature verify Contact us page functionality

  Background: 
    Given User is on homepage
    And User search for product as "Earphones"
    And User click on contact us Link

  Scenario: Verify that require element present or not
    When User navigate to contact us page
    Then Verify that Start chatting link should display
    And Verify that Call me link should display

  Scenario: Verification of start chatting link functionality
    When User click on start chatting link
    Then User navigate to Chat box

  Scenario: Verification of Call me link functionality
    When User click on call me link
    Then User navigate to another page which ask us mobile number
