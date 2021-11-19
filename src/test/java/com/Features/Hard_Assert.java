package com.Features;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Hard_Assert {
	
	@Test
	private void demo() {
		
		
		String expected = "Starc";
		
		String actual = "Smith";
		
//		Assert.assertEquals(actual, expected);
		
		Assert.assertNotEquals(actual,expected);
		
		System.out.println("Process Completed");

	}
	
}
