package com.ofss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		// We need to set the path of chromedriver or geckodriver
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wikipedia.com");
		System.out.println("Wikipedia website has been successfully opened");
		System.out.println("1. Page title is "+driver.getTitle());
		driver.quit();

	}

}
