package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AboutMePage {
	
	public WebDriver ldriver;
	
	public AboutMePage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	
	By txtFirstName = By.name("firstname");
	By txtLastName = By.name("lastname");
	By genderMale = By.id("sex-0");
	By genderFemale = By.id("sex-1");
	By experience7 = By.id("exp-6");
	By date = By.id("datepicker");
	By prefession = By.id("profession-1");
	By tool = By.id("tool-2");
	By continent = By.id("continents");
	By submit = By.id("submit");
	
	//Action methods
	public void setFirstName(String FirstName){
		ldriver.findElement(txtFirstName).sendKeys(FirstName);
	}
	
	public void setLastName(String LastName){
		ldriver.findElement(txtLastName).sendKeys(LastName);
	}

	public void setGender(String gender_value){
		if(gender_value.equals("Male"))
			ldriver.findElement(genderMale).click();
		else if(gender_value.equals("Female"))
			ldriver.findElement(genderFemale).click();
	}
	
	public void setExperience(String experience){
		if(experience.equals("7"))
			ldriver.findElement(experience7).click();
	}
	
	public void setDate(String date_value){
		ldriver.findElement(date).sendKeys(date_value);
	}
	
	public void setProfession(String profession_valule){
		if(profession_valule.equals("Automation Tester"))
			ldriver.findElement(prefession).click();
	}
	
	public void setTool(String tool_value){
		if(tool_value.equals("Selenium Webdriver"))
			ldriver.findElement(tool).click();
	}
	
	public void setContinet(String continet){
		Select drpContinent = new Select(ldriver.findElement(continent));
		drpContinent.selectByVisibleText(continet);
	}

	public void clickSubmit(){
		ldriver.findElement(submit).click();
	}
}
