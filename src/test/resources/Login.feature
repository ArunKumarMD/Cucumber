#Author: marunkumar865@gmail.com
@login
Feature: User login


@TestA
Scenario:  Login to swag laps and check the home page is loaded		
		When Enter User name and Password
		And User clicks on login
		Then Verify the login page 
		

@TestB
Scenario:  Login to swag labs and check the home page is loaded using 1D Datas		
    When Enter 1D User name and Password
		| standard_user | secret_sauce |
		And User clicks on login
		Then Verify the login page 
		
@TestC
Scenario:  Login to swag labs and check the home page is loaded using 2D Datas		
    When Enter 2D User name and Password tables
    | Username | standard_user|
		| Password | secret_sauce |
		And User clicks on login
		Then Verify the login page 

		
  



