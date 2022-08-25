package com.selenium.masterpart1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExtractTextInSelenium {

	@Test
	public void ImplicitWaitTest(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aparna Kalaskar\\workspace\\FirstSeleniumProject3\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		String headingtext = driver.findElement(By.xpath("//body[@class= 'fbIndex UIPage_LoggedOut _-kb _605a b_c3pyn-ahh chrome webkit win x1 Locale_en_GB cores-gte4 _19_u']")).getText();
		System.out.println(headingtext);
		Assert.assertEquals(headingtext, "Facebook helps you connect and share with the people in your life.");
		
		String loginBtnText = driver.findElement(By.xpath("//button[@name='login']")).getText();
		System.out.println(loginBtnText);
		Assert.assertEquals(loginBtnText, "Log In");
		
		driver.quit();
}}
