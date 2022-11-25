package com.ofss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocateElementsDemo {

	public static void main(String[] args) {
		// We need to set the path of chromedriver or geckodriver
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		List<WebElement> elements=driver.findElements(By.name("q"));
		if (elements.size()>0)
			System.out.println("Yes, the specified element is present");
		else
			System.out.println("No, no such element is found");
		driver.quit();

	}

}
