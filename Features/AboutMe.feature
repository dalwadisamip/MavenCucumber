Feature: About Me

Scenario: Fill About Me form successfully
	Given User Launch Chrome browser
	When User opens URL "https://www.techlistic.com/p/selenium-practice-form.html"
	And User enters Firstname as "sABC" and Lastname as "sXYZ" and Gender as "Male" and Experience as "7" and Date as "06-05-1983" and Profession as "Automation Tester" and AutomationTools as "Selenium Webdriver" and Continents as "Asia" and SeleniumCommand as "Wait Commands"
	And Click on Button
	And close browser