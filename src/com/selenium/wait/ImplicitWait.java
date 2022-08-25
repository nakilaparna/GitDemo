package com.selenium.wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWait {
	@Test
	public void ImplicitWaitTest(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aparna Kalaskar\\workspace\\FirstSeleniumProject3\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		
		WebElement searchBox= driver.findElement(By.xpath("//input[@name='q' and @title='Search']"));
		searchBox.sendKeys("Selenium-webdriver");
		
		
		
		WebElement searchResult=driver.findElement(By.xpath("//li[@role='presentation'][6]"));
		
		searchResult.click();
		
		driver.quit();
		
	}

}
