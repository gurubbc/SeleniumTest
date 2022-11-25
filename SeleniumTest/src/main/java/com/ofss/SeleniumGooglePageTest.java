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
		driver.get("https://www.google.com");
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
		List<WebElement> elements=driver.findElements(By.name("q"));
		System.out.println("The number of element with name q is "+elements.size());
		if (elements.size()>0)
			System.out.println("Yes, the google main page has search box");
		else
			System.out.println("No, the developer has forgotten to include the search field");
		Assert.assertTrue(elements.size()>0);
		
	}

}
