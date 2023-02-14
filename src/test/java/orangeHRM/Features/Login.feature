Feature: Login Functionality
  Scenario: Admin should be able to login Successfully with correct credentials
    Given User navigates to login page of OrangeHRM
    When User fills username as "Admin" and password as "admin123"
    And User Click on LoginButton
    Then Login must be successfull