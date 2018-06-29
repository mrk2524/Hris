package com.qait.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



	public class Base {
    public WebDriver driver = null;
	public WebDriver getdriver()
	{
	   System.setProperty("webdriver.chrome.driver","C:\\java programs\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver();
	   return driver;
	}

	}


