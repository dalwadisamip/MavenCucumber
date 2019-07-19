package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.AboutMePage;

public class steps_AboutMe {
	
	public WebDriver driver;
	public AboutMePage AM;
	
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers/chromedriver.exe");
		driver = new ChromeDriver();
		AM = new AboutMePage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) {
	    driver.get(url);
	}

	@When("User enters Firstname as {string} and Lastname as {string} and Gender as {string} and Experience as {string} and Date as {string} and Profession as {string} and AutomationTools as {string} and Continents as {string} and SeleniumCommand as {string}")
	public void user_enters_Firstname_as_and_Lastname_as_and_Gender_as_and_Experience_as_and_Date_as_and_Profession_as_and_AutomationTools_as_and_Continents_as_and_SeleniumCommand_as(String FirstName, String LastName, String gender_value, String experience, String date_value, String profession_valule, String tool_value, String continet, String string9) {
	   AM.setFirstName(FirstName);
	   AM.setLastName(LastName);
	   AM.setGender(gender_value);
	   AM.setExperience(experience);
	   AM.setDate(date_value);
	   AM.setProfession(profession_valule);
	   AM.setTool(tool_value);
	   AM.setContinet(continet);
	}

	@When("Click on Button")
	public void click_on_Button() {
		AM.clickSubmit();
	}

	@When("close browser")
	public void close_browser() {
	    
	}

}
