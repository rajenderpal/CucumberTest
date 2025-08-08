#Author rajender Pal Brar
Feature: feature is login functionality

	Scenario: Login into gmail

	Given User open chrome browser
	When Open gmail url
	When Enter user <name> and <pswd>
 	Then Close browser
 	
 	Examples:
	|name | pswd |
	|A|ABC|
	|B|ABD|

Scenario:

Given User open chrome browser
Then Close browser