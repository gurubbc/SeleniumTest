package com.ofss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillForm {

	public static void main(String[] args) {
		// We need to set the path of chromedriver or geckodriver
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement we=driver.findElement(By.name("q"));
		if (we!=null)
		{
			we.sendKeys("Python tutorial");
			we.sendKeys(Keys.ENTER);
		
		}
		
		
//		driver.quit();

	}

}
