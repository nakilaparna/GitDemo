package com.selenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class rediffSigninTest {
	@Test
	public void rediffsignin(){
		
		//set chrome executable property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aparna Kalaskar\\workspace\\FirstSeleniumProject3\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//open the rediff
		driver.get("https://www.rediff.com/");
		
		//verify the pagetitle
		String pageTitle =driver.getTitle();
		Assert.assertEquals(pageTitle, "Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
		
		//click on signin button
		WebElement signin = driver.findElement(By.linkText("Sign in"));
		signin.click();
		Assert.assertEquals(driver.getTitle(),"Rediffmail");
		
		//insert username & password
		WebElement username = driver.findElement(By.id("login1"));
		WebElement password = driver.findElement(By.name("passwd"));
		username.sendKeys("aparna@rediff.com");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		password.sendKeys("abc@123");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//click signin button
		WebElement signinBtn = driver.findElement(By.name("proceed"));
		signinBtn.click();
		
		//verify profile title
		//Assert.assertEquals(driver.getTitle(),"Welcome to Rediffmail");
		
		driver.quit();
		
		
		
		
}
}
