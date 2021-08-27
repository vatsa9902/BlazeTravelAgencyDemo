package com.example.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.example.model.CustomExceptionHandler;

public class CommonActions {


	protected String waitAndGetText(WebDriver driver, WebElement element) {
		String actualText = null;
		try {
			waitForElement(driver, element);
			actualText = element.getText();
		} catch (Exception ex) {
			new CustomExceptionHandler(getClass().getName(), element, ex);
		}
		return actualText;

	}
	
		protected void scrollIntoView(WebDriver driver, WebElement element) {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(500);
			element.click();
		} catch (Exception ex) {
			new CustomExceptionHandler(getClass().getName(), element, ex);
		}
	}

	protected boolean waitForElement(WebDriver driver, WebElement element) {
		boolean isElementDisplayed = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			isElementDisplayed = wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
		} catch (Exception ex) {
			new CustomExceptionHandler(getClass().getName(), element, ex);
		}
		return isElementDisplayed;

	}

}