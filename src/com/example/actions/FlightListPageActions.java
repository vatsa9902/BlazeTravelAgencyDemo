package com.example.actions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.example.pages.FlightListPage;

public class FlightListPageActions extends CommonActions {
	WebDriver driver;

	
	FlightListPage flightListPage = null;

	public FlightListPageActions(WebDriver driver) {
		this.driver = driver;
		flightListPage = PageFactory.initElements(driver, FlightListPage.class);
	}
	
	
	public String validateTextOnFlightListPage() {
		String flightTextPage = waitAndGetText(driver, flightListPage.textHeaderInFlightPage);
		return flightTextPage;
	}
	
	public boolean bookTicketBasedOnAirline(String airline) {
			boolean isFlightSelected = false;
			List<WebElement> ele = flightListPage.chooseFlightButton;
			
			//This is hardcoded here
			if(airline =="Lufthansa") {
				ele.get(4).click();
			} 
			
			// we can do like below also :
			
			//td[3] -- get the table data for airlines and store it in the value
			//td[1] -- get all the links and store in the key 
			
//			Based on the input from user select corresponding key and click
			return isFlightSelected;
	}
	
	

	
}