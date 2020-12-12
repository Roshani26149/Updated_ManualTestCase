Feature: Amazon HomePage
   This Feature verify the functionality of Amazon HomePage

  Background: User Navigate To URL
    Given User Enter The URL as "Amazon.com"
    When User is on Amazon Home Page

  Scenario: User is on homePage of Amazon After entering an URL
    Then Verify the title of Amazon
    And Verify That common elements of HomePage Should be displayed

  Scenario: Products display on homepage should be clickable
    And Click On a HomePage Product
    Then List Of That Product Should Display

  Scenario: User Click on Back To Top Bar,User present on top of the page
    And User Is On Bottom Of The Page
    And Click On Back To Top Bar
    Then User Should Directly goes to top of home page
