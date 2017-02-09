Feature:
  As an entrepreneur
  I want to be able to register my new project
  So that I can see my project in projects catalogue

  Scenario: Register a new project as entrepreneur
    Given I am on new project registration page
    When I fill my First Name "Leonid" and Last Name "Chernyshov" into Full Name field
    And I fill my City "Kyiv" into City field
    And I fill my phone number "+380000000000" into Phone field
    And I fill my email address "my.email5@address.com" into Email field
    And I fill my desired password "Equerest1" into Password field
    And I set checkbox to show my password
    And I go next to second project registration page
    And I fill my project name "My project" into Project name field
    And I fill my project description "My project description" into Description field
    And I click stage radiobutton 0
    And I fill competitive advantages "Advantages" into Advantages field
    And I fill monetization model "Monetization model" into Monetization field
    And I fill investment sum "1000000" into sum field
    And I click Finish registration
    Then I should see finish page