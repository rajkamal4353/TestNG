package com.Features;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	
	@Test
	private void demo() {
		
        String expected = "Starc";
		
		String actual = "Smith";
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(actual, expected);
		
		System.out.println("Process Completed");
		
	}

}
