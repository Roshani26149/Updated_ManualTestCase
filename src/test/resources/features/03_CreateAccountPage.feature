Feature: Amazon Create Account Page
  This Feature verify the functionality of Amazon Create new account page

  Background: 
    Given User is on homepage
    And User click on Sign In Securely tab

  Scenario: Verify that user is on Amazon Registration page
    When User click on create your amazon account link
    Then User navigate to next Page
    And Verify that Title of the page should be "Amazon Registration"

  Scenario: User able to create an account
    When User click on create your amazon account link
    And User enter name as "aakash"
    And User Enter mobile number as "9421065853"
    And User Enter Email address as "abcnv@gmail.com" and passord as "Vision@12"
    And Click on continue button
    Then Verify Your mobile number page should be displayed

  Scenario: User trying to create an account with invalid Username
    When User click on create your amazon account link
    And User enter name as "   "
    And User Enter mobile number as "9421065853"
    And User Enter Email address as "abcvf@gmail.com" and passord as "Vision@12"
    And Click on continue button
    Then User can able to see massage "Enter your name"

  Scenario: User trying to create an account with invalid Password
    When User click on create your amazon account link
    And User enter name as "Aakash"
    And User Enter mobile number as "9421065853"
    And User Enter Email address as "abcss@gmail.com" and passord as "Visio"
    And Click on continue button
    Then User can able to see massage "Passwords must be at least 6 characters."
