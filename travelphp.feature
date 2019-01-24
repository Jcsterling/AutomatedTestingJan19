Feature: Shopping on travelPhP website

	As a person
	I want to navigate the website
	So that I can purchase the items i want

Scenario: Pick a flight available on the websiite
	Given the correct web address
	When I select flight details
 	Then I can browse a list of available flights

Scenario: Confirm flight booking
	Given the correct web address
	When I add my personal details
	Then I am able to confirm the booking