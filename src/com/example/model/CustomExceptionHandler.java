package com.example.model;

import org.openqa.selenium.WebElement;

import com.example.config.AppConstants;

public class CustomExceptionHandler {
	ApplicationLogger log = ApplicationLogger.getInstance();
	
	public CustomExceptionHandler(String className, WebElement element, Exception ex) {
		log.error(className, element + AppConstants.NOT_AVAILABLE, ex);
	}

	public CustomExceptionHandler(String className, Exception ex) {
		log.error(className, "", ex);
	}

}
