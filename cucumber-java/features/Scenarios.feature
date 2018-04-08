Feature: To test the login functionality

  Scenario Outline: Login with Valid Credentials
    Given Open application with valid URL
    When I enter the valid "<username>" and valid "<password>"
    Then User should login successfully
    And Close the Browser

    Examples: 
      | userName         | password |
      | DemoSalesManager | crmsfa   |
      | DemoSalesManager | crmsfa   |

        Scenario Outline: Login with Valid Credentials
    Given Open application with valid URL
    When I enter the valid "<username>" and valid "<password>"
    Then User should login successfully
    And Close the Browser

    Examples: 
      | userName         | password |
      | DemoSalesManager | crmsfa   |
      | DemoSalesManager | crmsfa   |