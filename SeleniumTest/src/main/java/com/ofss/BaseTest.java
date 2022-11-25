//package com.ofss;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class BaseTest {
//	WebDriver driver;
//	
//	@BeforeSuite
//	public void setup()
//	{
//		// This will be called before calling any test cases
//		// Setup the brower here
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		
//	}
//	
//	@BeforeTest
//	public void openGoogle()
//	{
//		// Will be called before every test case
//		driver.get("https://www.google.com");
//	}
//	
//	@AfterSuite
//	public void tearDown()
//	{
//		// This will be called after all the test cases are over
//		// Deinitializer
//		driver.quit(); 
//		
//	}
//	
//}
