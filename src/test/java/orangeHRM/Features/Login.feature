Feature: Login Functionality

  Scenario Outline: User should be able to login Successfully with correct credentials
    Given User navigates to login page of OrangeHRM
    When User fills username as "<UserName>" and password as "<Password>"
    And User Click on LoginButton
    Then Login must be successfull
    Examples:
      | UserName   | Password  |
      | Admin      | admin123  |
      | mayurdeore | mayur@123 |
