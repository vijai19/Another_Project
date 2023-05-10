package org.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class CommonUtills {

	FileReader reader = null;
	
	private void loadTheVaue() throws FileNotFoundException {
		reader = new FileReader("config.properties");
		
		Properties property = new Properties();
		property.getProperty("app-url");
		property.getProperty("username");
		property.getProperty("password");
		

	}
	
	
	
}
