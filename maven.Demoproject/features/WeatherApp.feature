Feature: Test Weather service

Scenario: My first test
	Given I like to holiday in Sydney
	And I only like to holiday on Thursdays
	When I look up the weather forecast
	Then I receive the weather forecast
	And the temperature is warmer than 10 degrees
