@Facebook
Feature:FacebookFeature
  I want to test facebook application

  @LoginTag
  Scenario Outline: Login Scenario
    Given I am user of facebook application
    When User enter valid username <username>
    And User enter valid password <password>
    And User click on login button
    Then User should be able to login successfully
    
    	Examples:
    		| username | password |
    		| varun    | 12345    |
    		| sonavane | 45678    |
    
    
    @CreateNewAccount
    Scenario: Login Scenario
    Given I am user of facebook application
    When User click on create new account button
    Then User should be signup successfully

  
      
      ## Scenario : Straight  feature file and we cannot pass parameter  under this feature file
      
      ## Scenario Outline: Parameterized feature file and we can pass parameter and its value under this
      ## feature file by the help of "Examples"
      
       ## | in Examples  is used for Data Table Sepearator