package com.amol.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DashboardPO {

	@FindBy(linkText = "Admin")
	WebElement admin;

	public void adminRequest(WebDriver driver) throws InterruptedException {

		Actions action = new Actions(driver);
		action.moveToElement(admin).build().perform();
		Thread.sleep(5000);
		WebElement userManagment = driver.findElement(By.id("menu_admin_UserManagement"));
		action.moveToElement(userManagment).build().perform();

		WebElement users = driver.findElement(By.linkText("Users"));

		users.click();

	}

}
