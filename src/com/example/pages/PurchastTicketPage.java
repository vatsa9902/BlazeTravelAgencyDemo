package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PurchastTicketPage {
	
	
	WebDriver driver;

	@FindBy(how = How.ID, using = "inputName")
	public WebElement name;
	
	@FindBy(how = How.ID, using = "state")
	public WebElement state;
	
	
	@FindBy(how = How.ID, using = "address")
	public WebElement address;
	
	@FindBy(how = How.ID, using = "city")
	public WebElement city;
	
	
	@FindBy(how = How.ID, using = "zipCode")
	public WebElement zipCode;
	
	@FindBy(how = How.ID, using = "cardType")
	public WebElement creditCardType;
	
	
	@FindBy(how = How.ID, using = "creditCardNumber")
	public WebElement creditCardNumber;
	
	@FindBy(how = How.ID, using = "creditCardMonth")
	public WebElement creditCardMonth;
	
	@FindBy(how = How.ID, using = "creditCardYear")
	public WebElement creditCardYear;
	
	
	@FindBy(how = How.ID, using = "nameOnCard")
	public WebElement nameOnCard;

	@FindBy(how = How.XPATH, using = "//input[@type=\"submit\"]")
	public WebElement purchaseSubmitButton;
	
	@FindBy(how = How.XPATH, using = "//img")
	public WebElement vacationImageDisplayed;
	
	@FindBy(how = How.XPATH, using = "//h2")
	public WebElement purchaseText;
	@FindBy(how = How.XPATH, using = "//h1")
	public WebElement purchaseSuccessText;
	
	@FindBy(how = How.XPATH, using = "//pre")
	public WebElement jsonResponse;
	
	
	
	
}

