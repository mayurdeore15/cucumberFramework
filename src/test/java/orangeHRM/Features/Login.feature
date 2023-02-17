Feature: F1 | Login Functionality

  @Login
  Scenario Outline: S1TC1 | User should be able to login Successfully with correct credentials
    Given User navigates to login page of OrangeHRM
    When User fills username as "<UserName>" and password as "<Password>"
    And User Click on LoginButton
    Then Login must be successfull
    Examples:
      | UserName   | Password  |
      | Admin      | admin123  |
      | mayurdeore | Mayur@123 |

#  Scenario Outline: S2TC2 | User should not be able to login with incorrect username
#    Given User navigates to login page of OrangeHRM
#    When User fills username as "<UserName>" and password as "<Password>"
#    And User Click on LoginButton
#    Then Alert should be displayed as Invalid credentials !
#    Examples:
#      | UserName   | Password  |
#      | Admin1      | admin123  |
#      | mayurdeore1 | Mayur@123 |