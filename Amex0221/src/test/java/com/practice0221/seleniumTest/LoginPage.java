package com.practice0221.seleniumTest;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	public static WebDriver driver = new ChromeDriver();
	
	public static void Launch() {
		//WebDriver driver = new ChromeDriver();
		
		
		String urlrr = "https://mail.rediff.com/cgi-bin/login.cgi";
		driver.get(urlrr);
	
	}
	
	public static void login(String UN, String PWD) throws Throwable {
		
		 WebElement Login = driver.findElement(By.id("login1")); 
			//*[@id="password"] - Password Field
				    WebElement Password = driver.findElement(By.id("password"));;
				    
				    WebElement Signin = driver.findElement(By.name("proceed"));

				 
			    
				    Login.sendKeys(UN);
				    
				    Password.sendKeys(PWD);
				    //Click on Sign in Button to Login
				    Signin.click();
				    
				    System.out.println("Login is Successful");
				    Thread.sleep(4000);
		
	}
		public static void verifyTitle() {
			System.out.println(driver.getTitle());
			driver.quit();
			
		}
	
	

}
