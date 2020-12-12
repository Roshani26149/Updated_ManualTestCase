Feature: Amazon Login Page
  This Feature verify the functionality of Amazon LoginPage

  Background: 
    Given User is on homepage

  Scenario: User navigates to loginpage and  all required elements Should display
    When User click on Sign In Securely Tab
    Then Verify that title of the page
    And Verify all login page elements should be displayed

  Scenario Outline: Verification for existing user with either mobile number or email address
    When User click on Sign In Securely Tab
    And user enters "<Username>"
    And user click on continue button
    And user enters "<password>"
    And user click "log in" button
    Then user should see "My Account" Page

    Examples: 
      | Username                 | password   |
      |               9511824982 | Roshani@26 |
      | roshanimail4me@gmail.com | Pratik@28  |

  Scenario Outline: Verification for existing user After entering invalid username
    When User click on Sign In Securely Tab
    And user enters "<Username>"
    And user click on continue button
    Then Error massage should display

    Examples: 
      | Username           |
      | WelcomeToo         |
      | %dbgfmdldj         |
      |                    |
      | 1234rosh@gmail.com |
      |        95118249824 |
      |          951182498 |
      | $roshani@gmail.com |

  Scenario Outline: Verification for existing user After entering invalid Password
    When User click on Sign In Securely Tab
    And user enters "<Username>"
    And user click on continue button
    And user enters "<password>"
    Then Error massage should come

    Examples: 
      | Username                 | password   |
      |               9511824982 | 1234567895 |
      | roshanimail4me@gmail.com | roshaihel  |
      |               9511824982 |            |
