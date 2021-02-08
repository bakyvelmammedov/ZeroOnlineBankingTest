@login
  Feature: Only authorized users should be able to login
    @Authorized
    Scenario: Login as an authorized user
      Given the user is on the login page
      When user logs in with valid credentials
      Then Account summary page should be displayed

    @unAuthorized
    Scenario:  Login with invalid credentials
      Given the user is on the login page
      When the user enters the wrong username or password
      Then the user should be able to see "Login and/or password are wrong." message.

    @blank
    Scenario:  Login with blank credentials
      Given the user is on the login page
      When the user enters the blank username or password
      Then the user should be able to see "Login and/or password are wrong." message.

