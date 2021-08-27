package com.example.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.example.config.AppConstants;
import com.example.pages.PurchastTicketPage;

public class PurchasePageActions extends CommonActions {
	WebDriver driver;

	
	PurchastTicketPage purchaseTicketPage = null;

	public PurchasePageActions(WebDriver driver) {
		this.driver = driver;
		purchaseTicketPage = PageFactory.initElements(driver, PurchastTicketPage.class);
	}
	
	
	public String validateTextOnPurchase() {
		String flightTextPage = waitAndGetText(driver, purchaseTicketPage.purchaseText);
		return flightTextPage;
	}
	
	public String purchaseTicket() {
		purchaseTicketPage.name.sendKeys(AppConstants.NAME);
		purchaseTicketPage.address.sendKeys(AppConstants.ADDRESS);
		purchaseTicketPage.state.sendKeys(AppConstants.STATE);
		purchaseTicketPage.city.sendKeys(AppConstants.CITY);
		purchaseTicketPage.zipCode.sendKeys(AppConstants.ZIPCODE);
		scrollIntoView(driver, purchaseTicketPage.creditCardType);
//		purchaseTicketPage.creditCardType.sendKeys(AppConstants.creditCardType);
		Select sel = new Select(purchaseTicketPage.creditCardType);
		sel.selectByVisibleText("Visa");
		scrollIntoView(driver, purchaseTicketPage.creditCardNumber);
		purchaseTicketPage.creditCardNumber.sendKeys(AppConstants.creditCardNumber);
		scrollIntoView(driver, purchaseTicketPage.creditCardMonth);
		purchaseTicketPage.creditCardMonth.sendKeys(AppConstants.creditCardMonth);
		scrollIntoView(driver, purchaseTicketPage.creditCardYear);
		purchaseTicketPage.creditCardYear.sendKeys(AppConstants.creditCardYear);
		scrollIntoView(driver, purchaseTicketPage.purchaseSubmitButton);
		return waitAndGetText(driver, purchaseTicketPage.purchaseSuccessText);	
	}
	
	

	
}