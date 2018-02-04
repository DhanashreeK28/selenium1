package com.amol.utility;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInit {

	static WebDriver web = null;

	public static WebDriver openBrowser(String url) {
		web = new FirefoxDriver();
		web.get(url);
		web.manage().window().maximize();
		//web.manage().window().setPosition(new Point(-2000, 0));
		return web;
	}
}
