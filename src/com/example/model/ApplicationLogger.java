package com.example.model;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.example.config.AppConstants;

public class ApplicationLogger {

	private static ApplicationLogger instance = null;
	static final Logger log = Logger.getLogger(ApplicationLogger.class);

	public static ApplicationLogger getInstance() {
		if (instance == null) {
			instance = new ApplicationLogger();
			PropertyConfigurator.configure(AppConstants.LOG_FILEPATH);
		}
		return instance;
	}

	public void info(String myclass, String msg) {
		log.info("[" + myclass + "] " + msg);
	}

	public void error(String myclass, String msg, Exception ex) {
		log.error("[" + myclass + "] " + msg, ex);
	}

	public void warning(String myclass, String msg) {
		log.warn("[" + myclass + "] " + msg);
	}
}