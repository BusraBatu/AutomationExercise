Feature: TC_02

  @simple @login
  Scenario:TC_02 Login User with correct email and password
    Given  Navigate to url 'URL' in browser
    Then Verify that home page is visible successfully
    And Click on 'Signup / Login' button
    Then Verify that 'Login to your account' is visible
    And Enter correct email address and password
    Then Click 'login' button
    And Verify that 'Logged in as username' is visible
    Then Click 'Delete Account' button
    And Verify that 'ACCOUNT DELETED!' is visible