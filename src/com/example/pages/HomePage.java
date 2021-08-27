package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//div/h1")
	public WebElement homePageText;

	@FindBy(how = How.XPATH, using = "//a[@href=\"vacation.html\"]")
	public WebElement vacationHtmlLinkValidation;

	@FindBy(how = How.NAME, using = "fromPort")
	public WebElement fromDropDown;

	@FindBy(how = How.NAME, using = "toPort")
	public WebElement toDropDown;

	@FindBy(how = How.XPATH, using = "//input[@type=\"submit\"]")
	public WebElement submitButton;
	
	@FindBy(how = How.XPATH, using = "//img")
	public WebElement vacationImageDisplayed;
}
