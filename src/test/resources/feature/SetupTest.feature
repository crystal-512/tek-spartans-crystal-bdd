Feature: This feature to setup framework

  Scenario: Validate top left corner logo
    #Given Open browser and navigate to retail app
    Then validate top left corner is TEKSCHOOL
    #Then Close the browser

  Scenario: Validate top left logo and sign in button is enabled
    Then validate top left corner is TEKSCHOOL
    Then Validate Sign in button is enabled

