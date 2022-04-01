@SignUpPage
Feature:SignUpFeature
  I want to test SignUp functionality

	@SignUp
  Scenario Outline: SignUp Scenario
    Given  I am user of facebook application
    When User click on create new account button
    When User enter firstname<firstname>
    And User enter lastname<lastname>
    Then User should be  able to Signup Successfully


    Examples: 
      |firstname | lastname  |
      | varun    | sonavane  |
      | mansi    | sonavane  |
