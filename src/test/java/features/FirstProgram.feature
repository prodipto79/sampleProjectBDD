Feature: Login Functionality
  Scenario: Login as a admin
    Given user on net banking login page
    When user login into application as user 1111 and password as 123
    Then user navigated to homepage
    And cards are displayed
    And log off button displayed

  @smoketest
  Scenario Outline: Login as a user
    Given user on net banking login page
    When user login into application as user "<User>" and password as "<Password>"
    Then user navigated to homepage
    And cards are displayed
    And log off button displayed
    Examples:
      |User  |Password|
      |Credit Card User|Password1|
      |Debit Card User|Password2|
