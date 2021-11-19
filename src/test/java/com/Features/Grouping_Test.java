package com.Features;

import org.testng.annotations.Test;

public class Grouping_Test {
	
	
	@Test(groups = "books")
    private void books() {
		
		System.out.println("books");
		
	}
	
	@Test(groups = "books")
    private void novel() {
		
		System.out.println("novel");
		
	}
	
	@Test(groups = "Social Media")
    private void facebook() {
		
		System.out.println("FB");
		
	}
	
	@Test(groups = "Social Media")
    private void whatsapp() {
		
		System.out.println("Whatsapp");
		
	}
	
	@Test(groups = "Music")
    private void spotify() {
		
		System.out.println("Spotify");
		
	}
	
	@Test(groups = "Music")
    private void wynkMusic() {
		
		System.out.println("Wynk Music");
		
	}

}
