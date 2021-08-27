package com.example.config;

public final class AppConstants {
	// prevents instantiation
	private AppConstants() {
	}

	public enum BROWSER_NAME {
		CHROME, FIREFOX, IE, SAFARI
	}

	// accessing file location
	public static final String APPCONFIG_FILEPATH = "res\\application.properties";
	public static final String LOG_FILEPATH = "res\\log4j.properties";
	public static final String NOT_AVAILABLE = "not available";

	// HomeScreen text
	public static final String HomePageText = "Welcome to the Simple Travel Agency!";
	// flight list page text
	public static final String flightListPageText = "Flights from Boston to Dublin:";
	public static final String purchaseSuccessText = "Thank you for your purchase today!";

	public static final String purchaseText = "Your flight from TLV to SFO has been reserved.";
	public static final String NAME = "Shreevatsa Kadekar";
	public static final String ADDRESS = "Kaggadasapura";
	public static final String STATE = "Karnataka";
	public static final String CITY = "Bangalore";
	public static final String ZIPCODE = "520250";
	public static final String creditCardType = "Visa";
	public static final String creditCardNumber = "123415251245";
	public static final String creditCardMonth = "11";
	public static final String creditCardYear = "11";
	public static final String nameOnCard = "Shreevatsa Kadekar";

}
