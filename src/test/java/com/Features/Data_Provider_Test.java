package com.Features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Test {
	
	
	@Test(dataProvider = "test_Data")
	private void credentials(String username, int password) {
		
		System.out.println("Username :" + username);
		
		System.out.println("Passsword :" + password);
	}
	
	@DataProvider
	private Object[][] test_Data() {
		
		return new Object[][] {
			
			{"Starc", 123},
			
			{"Smith", 234},
			
			{"Watson", 1710}
			
	    };
	    
    }
	
}