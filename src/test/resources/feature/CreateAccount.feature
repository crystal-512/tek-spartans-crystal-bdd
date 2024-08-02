Feature: New Account

  Scenario: Create new account
    When user click on sign in link
    Then validate user is in sign in page
    When user click on create new account link
    Then validate user is in create new account page
    When user enter "name", "email", "password", and "confirmPassword" and click create account
    Then validate new account is created

