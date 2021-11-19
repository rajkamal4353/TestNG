package com.Features;


import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_Test {
	
	@Test
	@Parameters({"username","password"})
	private void credentials(@Optional("Smith")String username, String password){
		
		System.out.println("Username : "+username);
		
		System.out.println("Passsword : "+password);
	}
}
