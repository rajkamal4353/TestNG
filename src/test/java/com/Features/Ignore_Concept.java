package com.Features;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	
	@BeforeMethod
    private void login() {
		
		System.out.println("Login");
		
	}
	
	@Test(enabled = false)
    private void laptop() {
		
		System.out.println("Laptop");
		
	}
	
	@Test
    private void mobile() {
		
		System.out.println("Mobile");
		
	}
	
	@Test
    private void earphones() {
		
		System.out.println("Earphones");
		
	}
	
	@Ignore
	@Test
    private void books() {
		
		System.out.println("Books");
		
	}

	@AfterMethod
    private void logout() {
		
		System.out.println("Logout");
		
	}

}
