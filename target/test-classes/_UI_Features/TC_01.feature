Feature: TC_01

  @registration
  Scenario:TC_01 User Registration

    Given Navigate to url 'URL' in browser
    And   Verify that home page is visible successfully
    Then  Click on 'Signup / Login' button
    And   Verify that 'New User Signup!' is visible
    And   Enter name and email address
    Then  Click 'Signup' button
    And   Verify that 'Enter Account Information' is visible
    Then  Fill details: Title, Name, Email, Password, Date of birth
    And   Select checkbox 'Sign up for our newsletter!'
    Then  Select checkbox 'Receive special offers from our partners!'
    And   Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    Then  Click 'Create Account' button
    And   Verify that 'Account Created!' is visible
    Then  Click 'Continue' button
    And   Verify that 'Logged in as' is visible
    Then  Click ' Delete Account' button
    And   Verify that "ACCOUNT DELETED!" is visible and click "Continue" button
