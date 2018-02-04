package com.amol.OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.amol.utility.AppConstatnt;
import com.amol.utility.DriverInit;

public class LoginTest {

	static WebDriver web = null;

	@Test
	public void initBrowser() throws InterruptedException {

		web = DriverInit.openBrowser(AppConstatnt.hrmUrl);
		LoginPO log = PageFactory.initElements(web, LoginPO.class);
		log.enterCredt("Admin", "admin");
		
		DashboardPO dashb= log.submitCret(web);
		dashb.adminRequest(web);
	}
	


}
