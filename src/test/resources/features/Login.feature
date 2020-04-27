Feature: Login
  As a user,
  I should be able to login to the application

  Scenario: Login as a librarian
    Given I am on the login page
    When I login as a librarian user
    Then dashboard should be displayed

    #this is a comment