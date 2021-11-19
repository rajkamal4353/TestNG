package com.Features;

import org.testng.annotations.Test;

public class Priority_Test {
	
	@Test(priority = 1)
    private void laptop() {
		
		System.out.println("Laptop");
		
	}

	@Test(priority = -1)
    private void mobile() {
		
		System.out.println("Mobile");
		
	}
	
	@Test(priority = 0)
    private void earphones() {
		
		System.out.println("Earphones");
		
	}
	
	@Test
    private void books() {
		
		System.out.println("Books");
		
	}
	
}
