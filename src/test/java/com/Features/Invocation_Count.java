package com.Features;

import org.testng.annotations.Test;

public class Invocation_Count {
	
	@Test(priority = -1)
    private void homepage() {
		
		System.out.println("Click on Login Button");
		
	}
	
	@Test(invocationCount = 3)
    private void refresh() {
		
		System.out.println("Refresh");
		
	}
	
	@Test(priority = 1)
    private void newsfeed() {
		
		System.out.println("News Feed");
		
	}
}
