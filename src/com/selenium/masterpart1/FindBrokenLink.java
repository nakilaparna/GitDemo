package com.selenium.masterpart1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindBrokenLink {
	@Test
	public void ImplicitWaitTest(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aparna Kalaskar\\workspace\\FirstSeleniumProject3\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://edition.cnn.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No.Of links:"+links.size());
		for(WebElement link:links)
		{
			System.out.println(link.getText());
		}
		
		
		driver.quit();
}

}
