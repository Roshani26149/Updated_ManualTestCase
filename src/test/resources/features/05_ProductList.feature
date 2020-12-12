Feature: Amazon ProductList
  This Feature verify the ProductList functionality

  Background: 
    Given User is on homepage
    And User search for product as "Earphones"
    And Click on Search Tab

  Scenario: User can see the list of the earphones
    Then Verify that Title should be "Amazon.in : earphones"

  Scenario: User navigate to Next Page to search more earphones
    When User is on Bottom of the page
    And User click on Next Tab
    Then User should navigate to next page

  Scenario: User should navigate to Previous Page
    When User click on previous button
    Then verify that user is on privious page or not

  Scenario: verify Need Help link and go to that link
    When User is on bottom of the page
    And User can able to see need help link
    And User Click on visit the help section
    Then User navigate to Help & Customer Service page

  Scenario: verify Contact us link and go to that link
    When User click on contact us Link
    Then User navigate to contact us page
