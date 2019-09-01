#Author: chandu.siddhapuram@gmail.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables).
#+*2*0*
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#@tag
#Feature: Title of your feature
  #I want to use this template for my feature file
#
  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
      
 @TESTLINKS
 Feature: THe purpose of this feature is to test the lin given is accessable or not
   As a tester/moniotring team memebr i wnat to check that the links are accessble after the servers are been resatretd 
   
   
   Scenario: Validate that the link is acceble
     Given the link "https://www.facebook.com"
     When the user opens a broweser
       And navigates to this Link
     Then validate the site is loaded sucessfully
     
     
     
   Scenario: Validate that the link is accessable  and user is able to login
     Given the link "https://www.facebook.com"
     When the user opens a broweser
       And navigates to this Link
       And enters the username""
       And enter the password ""
         Then validate the site is loaded sucessfully
