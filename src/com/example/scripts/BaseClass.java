package com.example.scripts;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.example.model.CustomExceptionHandler;

public class BaseClass {

	public static WebDriver driver = null;
	public static SoftAssert softAssert = new SoftAssert();

	@BeforeSuite
	@Parameters("browser")
	public void getDriver(String browser) {

		DriverConfiguration driverConfig = new DriverConfiguration();
		try {
			driver = driverConfig.intialiseDriver(browser, driver);
		} catch (MalformedURLException ex) {
			new CustomExceptionHandler(getClass().getName(), ex);
		}
	}

	@AfterSuite
	public void teardown() throws IOException, InterruptedException {
		driver.close();
		driver.quit();
	}
}
