package com.example.scripts;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.example.actions.FlightListPageActions;
import com.example.actions.HomePageActions;
import com.example.actions.PurchasePageActions;
import com.example.config.AppConstants;
import com.example.config.ProjectPropertyUtil;


public class TravelAgencyTicketBookingTests extends BaseClass {
	
	HomePageActions homePageAction;
	FlightListPageActions flightListPageAction;
	PurchasePageActions purchasePageAction;
	
	void loadPage() {
		driver.get(ProjectPropertyUtil.readProperty("baseurl"));
	}

	@Test (priority =1)
	public void validateHomePageTests() {
		homePageAction = new HomePageActions(driver);
		loadPage();
		String homeActualText = homePageAction.validateHomeScreenText();
		softAssert.assertEquals(homeActualText, AppConstants.HomePageText);
	}

	@Test (priority =2)
	public void validateToAndFromDropDown() {
		//list is hard code here but can be pulled from excel
		ArrayList<String> fromCountries = new ArrayList<>();
		ArrayList<String> toCountries = new ArrayList<>();
		fromCountries.add("Paris");
		fromCountries.add("Philadelphia");
		fromCountries.add("Boston");
		fromCountries.add("Portland");
		fromCountries.add("San Diego");
		fromCountries.add("Mexico City");
		fromCountries.add("São Paolo");
		boolean isFromCountriesValidated = homePageAction.validateContentInFromDropDown(fromCountries);
		softAssert.equals(isFromCountriesValidated);
		toCountries.add("Buenos Aires");
		toCountries.add("Rome");
		toCountries.add("London");
		toCountries.add("Berlin");
		toCountries.add("New York");
		toCountries.add("Dublin");
		toCountries.add("Cairo");
		boolean isToCountriesValidated = homePageAction.validateContentInToDropDown(toCountries);
		softAssert.equals(isToCountriesValidated);
		softAssert.assertAll();
	}
	
	@Test(priority =3)
	public void validateCountrySelection() {
		flightListPageAction = new FlightListPageActions(driver);
		homePageAction.bookingTicketSelection("Boston", "Dublin");
		String textOnFlightListPage = flightListPageAction.validateTextOnFlightListPage();
		softAssert.assertEquals(textOnFlightListPage, AppConstants.flightListPageText);
	}
	
	@Test(priority =4)
	public void validteTicketSelectionBasedOnAirLine() {
		purchasePageAction = new PurchasePageActions(driver);
		flightListPageAction.bookTicketBasedOnAirline("Lufthansa");
		String purchasePageText = purchasePageAction.validateTextOnPurchase();
		softAssert.assertEquals(purchasePageText, AppConstants.purchaseText);
	}
	
	@Test(priority =5)
	public void validatePurchaseTicket() {
		String purchaseSuccessText =  purchasePageAction.purchaseTicket();
		softAssert.assertEquals(purchaseSuccessText, AppConstants.purchaseSuccessText);
	}
	 
	//TestCase to validate the json response for currency and other purchase details & date can be added
	//Validate if the card number is xxxxxx1212
	//Text field validations can be done
}
