package com.amol.OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPO {

	@FindBy(name = "txtUsername")
	WebElement username;

	@FindBy(name = "txtPassword")
	WebElement password;

	@FindBy(name = "Submit")
	WebElement submit;
	
	@FindBy(id = "spanMessage")
	WebElement error;

	public void enterCredt(String usern,String passw) {

		username.clear();
		username.sendKeys(usern);

		password.clear();
		password.sendKeys(passw);

	}

	public DashboardPO submitCret(WebDriver driver) {
	
		submit.click();
		return PageFactory.initElements(driver, DashboardPO.class);
	}

	public String getError(){
		return error.getText();
	}
	
}
