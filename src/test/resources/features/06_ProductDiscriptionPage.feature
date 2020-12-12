Feature: Amazon Product detail
  This Feature verify the Product detail functionality

  Background: 
    Given User is on homepage
    And User search for product as "Earphones"
    And Click On a Product

  Scenario: Product Description page display or not
    When User is navigate to product description page
    Then Verify that Product description page Title should be matched

  Scenario: User can able to see Star Rating in product description
    When User is navigate to product description page
    And User mouse hover to the star rating
    Then All customer review link should display

  Scenario: Verify require rating present or not
    When User is navigate to product description page
    Then Verify that price of product link display or not
    And Verify that Delivery date link display or not
    And Verify that Have question query box link display or not
    And Verify that Customer questions & answers link display or not
    And Verify that customer image link display or not
    And Verify that Top reviews from India link display or not

  Scenario: Add To Cart Tab Feature
    When User is navigate to product description page
    And Select the Quality as 2
    Then Verify that Add Gift Option should display
    And Verify that add to wish list link should display

  Scenario: Add To Cart Tab functionality
    When User Click on Add to cart link
    Then User is navigate Added To Cart Page

  Scenario: Buy now Link
    When User Click on Buy now link
    And User navigate to login page
    And Enter password as "Roshani@26"
    Then User navigate to Select a delivery address page
