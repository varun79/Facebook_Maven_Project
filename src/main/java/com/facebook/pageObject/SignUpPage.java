package com.facebook.pageObject;

import org.openqa.selenium.By;

public class SignUpPage extends LoginPage{
	
	

	public void firstname(String fname) {
		
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fname);
	}
	
	public void lastname(String lname) {
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lname);
	}
	
    public void verifySignUp() {
		
		System.out.println("SignUp Successfully");
	}
}
