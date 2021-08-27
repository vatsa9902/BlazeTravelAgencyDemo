package com.example.actions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.example.pages.HomePage;

public class HomePageActions extends CommonActions {
	WebDriver driver;

	HomePage homePage = null;

	public HomePageActions(WebDriver driver) {
		this.driver = driver;
		homePage = PageFactory.initElements(driver, HomePage.class);
	}

	/*
	 * validates Use service livebutton in the Mercedes Me Portal
	 */
	public String validateHomeScreenText() {
		String homePageText = waitAndGetText(driver, homePage.homePageText);
		return homePageText;
	}

	public boolean validateContentInFromDropDown(ArrayList<String> expectedFromCountries) {
		boolean listIsCorrect = false;
		Select dropDownItem = new Select(homePage.fromDropDown);
		List<WebElement> options = dropDownItem.getOptions();
		for (int i = 0; i < options.size(); i++) {
			if (expectedFromCountries.get(i) == options.get(i).getText()) {
				listIsCorrect = true;
			}
		}
		return listIsCorrect;
	}

	public boolean validateContentInToDropDown(ArrayList<String> expectedFromCountries) {
		boolean listIsCorrect = false;
		Select dropDownItem = new Select(homePage.toDropDown);
		List<WebElement> options = dropDownItem.getOptions();
		for (int i = 0; i < options.size(); i++) {
			
			System.out.println(expectedFromCountries.get(i) + "from app");
			System.out.println(options.get(i).getText() + "from data");
			
//			if (expectedFromCountries.get(i) == options.get(i).getText()) {
//				listIsCorrect = true;
//			}
		}
		return listIsCorrect;
	}

	public void bookingTicketSelection(String from, String to) {
		boolean listIsCorrect = false;
		Select dropDownItemFrom = new Select(homePage.fromDropDown);
		Select dropDownItemTo = new Select(homePage.toDropDown);
		dropDownItemFrom.selectByVisibleText(from);
		dropDownItemTo.selectByVisibleText(to);
		homePage.submitButton.click();

	}
}