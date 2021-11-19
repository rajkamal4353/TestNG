package com.Features;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Demo implements IRetryAnalyzer {

	int count = 1;
	
	int limit = 5;
	
	public boolean retry(ITestResult result) {
		
		if (count<=limit) {
			
			count++;
			
			return true;   // invoke the method
			
		}
		
		return false;     // stop the execution
	}
}
