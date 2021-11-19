package com.Features;

import org.testng.annotations.Test;

public class Expected_Exceptions {
	
	@Test(expectedExceptions = ArithmeticException.class)
	
//  @Test(expectedExceptions = NullPointerException.class)	
	
	private void data() {
		
		int a = 10;
		
		System.out.println(a/0);
		System.out.println("Process Completed");
	}
}
