package com.example.scripts;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.example.config.AppConstants.BROWSER_NAME;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class DriverConfiguration {

	private WebDriver chromeDriver() {
		ChromeOptions options = new ChromeOptions();
		ChromeDriverManager.chromedriver().setup();
		options.addArguments("--disable-extensions");
		return  new ChromeDriver(options) ;
	}

	public WebDriver intialiseDriver(String browser, WebDriver driver) throws MalformedURLException {
		if (browser.equalsIgnoreCase(BROWSER_NAME.CHROME.toString())) {
			driver = chromeDriver();
			driver.manage().window().maximize();
		} 
		return driver;
	}
}
