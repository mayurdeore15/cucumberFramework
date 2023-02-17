Feature: F3 | Admin should be able to manage user from admin/user managemet panal

  @Admin
  Scenario: S4TC6 | Verify Admin is able to search user by username
    Given User is already logged in with admin credentials "Admin" and "admin123" to application and navigate to admin panel
    When User fills username as "mayurdeore"
    And Clicks on search button
    Then List of accounts is displayed


#  Scenario: S4TC7 | Verify Admin is able to search user by Role
#    Given adsf
#    When asdf
#    Then asdf
#
#  Scenario: S4TC8 | Verify Admin is able to search user by Employee Name
#    Given adsf
#    When asdf
#    Then asdf
#
#  Scenario: S4TC9 | Verify Admin is able to search user by Status
#    Given adsf
#    When asdf
#    Then asdf