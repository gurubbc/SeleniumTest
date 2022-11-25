package com.ofss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumGooglePageTest{
	
WebDriver driver;
	
	@BeforeSuite
	public void setup()
	{
		// This will be called before calling any test cases
		// Setup the driver here
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	
	@BeforeTest
	public void openGoogle()
	{
		// Will be called before every test case
		driver.get("http://localhost:8082/LoginApplication1/Login.html");
	}
	
	@AfterSuite
	public void tearDown()
	{
		// This will be called after all the test cases are over
		// Deinitializer
		driver.quit(); 
		
	}
	
	@Test
	public void testElement()
	{
		if (driver!=null)
			System.out.println("Driver not null in selenium");
		else
			System.out.println("Driver is null in selenium");
		List<WebElement> elements=driver.findElements(By.name("uname"));
		System.out.println("The number of element with name uname is "+elements.size());
		if (elements.size()>0)
			System.out.println("Yes, this page has USERNAME field to type the username");
		else
			System.out.println("No, this page doesn't have USERNAME field...");
		Assert.assertTrue(elements.size()>0);
		
	}

}
