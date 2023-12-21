Feature: Authentication
  As a user
  I want to successfully register
  So that i can login with my account

  @SuccessLoginAndLogout 
  Scenario: Verify user successfully login and logout with valid email and password
  	Given I am on the login page
  	When I input valid email and password
  	And I click login button
  	And I click profile button
  	And I click logout button
  	Then I navigated back to login page
  	
  	
  @LoginWithInvalidEmail
  Scenario: Verify user failed to login with invalid email
  #	Given I am on the login page
  	Given I input invalid email and valid password
  	When I click login button
  	Then I can see alert email not registered
  	
 	@LoginWithInvalidEmailFormat
 	Scenario: Verify user failed to login with invalid email format
  #	Given I am on the login page
  	Given I input invalid email format and valid password
  	When I click login button
  	Then I can see alert email not registered
  	
  
  @VerifyAlertRegisterWithEmptyData
  Scenario: Verify user can see alert empty data for register
  	Given I am on the register page
  	When I enter the password confirmation and delete it again	
  	And I can see alert password confirmation must be filled
  	And I enter the email and delete it again
  	And I can see alert email must be filled
  	And I enter the name and delete it again
  	And I can see alert name must be filled
  	And I enter the password and delete it again
  	Then I can see alert password must be filled
  	
  	
  @VerifyAlertRegisterWithInvalidData
  Scenario: Verify user can see alert invalid data for register
  	Given I open the register page
  	When I enter invalid password confirmation
  	And I enter invalid email format
  	And I can see alert email is invalid
  	And I enter numeric name
  	And I can see alert name is invalid
  	And I enter password 
  	Then I can see alert password confirmation is invalid
  	
  