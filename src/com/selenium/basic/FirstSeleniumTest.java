package com.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
	@Test
	public void verifyFaceBookHomePage(){
		String URL = "https://www.facebook.com";
		//set chrome executable property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aparna Kalaskar\\workspace\\FirstSeleniumProject3\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		//get current pagetitle
		String pageTitle = driver.getTitle();
				System.out.println("Name of the pagetitle" +pageTitle);
				//verify current pagetitle
		Assert.assertEquals(pageTitle, "Facebook – log in or sign up");
		driver.close();
	}

}
