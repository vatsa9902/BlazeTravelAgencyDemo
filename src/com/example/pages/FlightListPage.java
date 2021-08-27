package com.example.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FlightListPage {
	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//h3")
	public WebElement textHeaderInFlightPage;
	
	
	@FindBy(how = How.XPATH, using = "//input[@type=\"submit\"]")
	public List<WebElement> chooseFlightButton;

	
	

}
