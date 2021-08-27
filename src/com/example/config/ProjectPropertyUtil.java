package com.example.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class ProjectPropertyUtil {
   
	public static String readProperty(String key) {
		String value = null;
		Properties prop = new Properties();
		try (InputStream input = new FileInputStream(AppConstants.APPCONFIG_FILEPATH)) {
			prop.load(input);
			value = prop.getProperty(key);
		} catch (IOException ex) {
		}
		return value;
	}
}
