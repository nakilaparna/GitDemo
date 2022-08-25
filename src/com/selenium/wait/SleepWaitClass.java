package com.selenium.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SleepWaitClass {
	@Test
	public void googleSearch(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aparna Kalaskar\\workspace\\FirstSeleniumProject3\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		WebElement searchBox= driver.findElement(By.xpath("//input[@name='q' and @title='Search']"));
		searchBox.sendKeys("selenium-webdriver");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement searchResult=driver.findElement(By.xpath("//li[@role='presentation'][6]"));
		searchResult.click();
		
		driver.quit();
		
		
	}

}
