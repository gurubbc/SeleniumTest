package com.ofss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinkCounter {

	public static void main(String[] args) {
		// We need to set the path of chromedriver or geckodriver
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8082/LoginApplication1/");
		List<WebElement> elements=driver.findElements(By.tagName("a"));
		if (elements.size()>0)
			System.out.println("The hyperlink counter is "+elements.size());
		else
			System.out.println("No, no hyper link is found");
		driver.quit();

	}

}
