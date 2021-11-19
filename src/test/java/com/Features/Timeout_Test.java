package com.Features;

import org.testng.annotations.Test;

public class Timeout_Test {
	
	@Test(timeOut=4000)  // ---should be given more time than mentioned below
	private void demo() throws Throwable {
		
		Thread.sleep(1000);
		
		System.out.println("Click on Login Button");
		
		Thread.sleep(2000);
		
		System.out.println("News Feed");
	}
}
