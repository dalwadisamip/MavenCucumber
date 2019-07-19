$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/AboutMe.feature");
formatter.feature({
  "name": "About Me",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Fill About Me form successfully",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "steps_AboutMe.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://www.techlistic.com/p/selenium-practice-form.html\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps_AboutMe.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Firstname as \"sABC\" and Lastname as \"sXYZ\" and Gender as \"Male\" and Experience as \"7\" and Date as \"06-05-1983\" and Profession as \"Automation Tester\" and AutomationTools as \"Selenium Webdriver\" and Continents as \"Asia\" and SeleniumCommand as \"Wait Commands\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps_AboutMe.user_enters_Firstname_as_and_Lastname_as_and_Gender_as_and_Experience_as_and_Date_as_and_Profession_as_and_AutomationTools_as_and_Continents_as_and_SeleniumCommand_as(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Button",
  "keyword": "And "
});
formatter.match({
  "location": "steps_AboutMe.click_on_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "steps_AboutMe.close_browser()"
});
formatter.result({
  "status": "passed"
});
});