package com.Features;
import org.testng.Assert;
import org.testng.annotations.Test;

public class My_Test_Demo {
	
	@Test(retryAnalyzer = Retry_Demo.class)
	private void username() {
		
		String expected_Username = "Starc";
		
		String actual_Username = "Starc";
		
		Assert.assertEquals(actual_Username, expected_Username);
	}

	@Test(retryAnalyzer = Retry_Demo.class)
	private void password() {
		
		String expected_Password = "Starc";
		
		String actual_Password = "Starc123";
		
		Assert.assertEquals(actual_Password, expected_Password);
	}
}
