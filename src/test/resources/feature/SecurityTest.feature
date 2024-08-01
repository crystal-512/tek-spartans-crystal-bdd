Feature:Security tests scenario

  Scenario:validate sign in functionality with valid credential
    When user click on sign in link
    Then validate user is in sign in page
    When user enter "crystal.a512@gmail.com" and "CC512cc!" and click login
    #When user enter username and password and click login
    Then user should be able to see account link

