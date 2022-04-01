package com.facebook.pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static WebDriver driver;
	
	public void openUrl() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
	}
	
	public void userName(String username) {
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		
	}
	
	public void password(String password) {
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	}
	
	public void loginButton() {
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}
	
	public void verifyLogin() {
		
		System.out.println("Login Successfully");
		
	}
	
	public void createNewAccount() throws Exception {
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		
	}
	
	public void verifySignUp() {
		
		System.out.println("SignUp Successfully");
	}
}
