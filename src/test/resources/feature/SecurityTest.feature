Feature:Security tests scenario

  Scenario: Validate sign in functionality with valid credential
    When user click on sign in link
    Then validate user is in sign in page
    When user enter "crystal.a512@gmail.com" and "CC234cc!" and click on login
    #When user enter username and password and click login
    Then user should be able to see account link

  Scenario: Validate sign in with invalid username valid password
    When user click on sign in link
    Then validate user is in sign in page
    When user enter "invalid@gmail.com" and "CC234cc!" and click on login
    #When user enter username and password and click login
    Then user should see error "wrong username or password"

  Scenario: Validate sign in invalid credentials
    When user click on sign in link
    Then validate user is in sign in page
    When user enter "crystal.a512@gmail.com" and "WrongPassword223" and click on login
    #When user enter username and password and click login
    Then user should see error "wrong username or password"

    Scenario Outline:
      When user enter "crystal.a512@gmail.com" and "WrongPassword223" and click on login
      Then user should see error "wrong username or password"

      Examples:
      | username               | password
      | invalid@gmail.com      | CC234cc!
      | crystal.a512@gmail.com | WrongPassword223



