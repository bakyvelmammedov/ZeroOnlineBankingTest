  @wip
  Feature: Only authorized users should be able to login
    Scenario:
      Given the user is on the login page
      When user logs in with valid credentials
      Then Account summary page should be displayed