
@tag
Feature: Test to login user credential
  I want to use this template for my feature file

 # @tag1
  #Scenario: Login to system
   # Given launch browser and open URL
    #When user enters UN & Password
    #Then user is logged in system
    
@LoginTest

 Scenario Outline:
    Given launch browser and open URL
    When user enters "<UN>" & "<Password>"
    Then user is logged in system
    
    Examples:
    |UN|Password|
    |vikramrajsharma|raji@143|